package com.feyl.work.creationalpatterns.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * @author Feyl
 * @date 2021/9/28 20:31
 */
public class DataSource {
    private final String driver;
    private final String url;
    private final String username;
    private final String password;
    private final int initialSize;
    private final int maxActive;
    private final int increment;
    private final long maxWait;//没有使用
    private final ConcurrentLinkedDeque<Conn> conns = new ConcurrentLinkedDeque<>();

    private DataSource(){
        // 资源绑定器
        ResourceBundle bundle = ResourceBundle.getBundle("dataBase");
        // 通过属性配置文件获取信息
        this.driver = bundle.getString("driver");
        this.url = bundle.getString("url");
        this.username = bundle.getString("username");
        this.password = bundle.getString("password");
        this.initialSize = Integer.parseInt(bundle.getString("initialSize"));
        this.maxActive = Integer.parseInt(bundle.getString("maxActive"));
        this.increment = Integer.parseInt(bundle.getString("increment"));
        this.maxWait = Long.parseLong(bundle.getString("maxWait"));
        try {
            Class.forName(driver);
            createConnection(initialSize);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static class InnerClass{
        private final static DataSource instance = new DataSource();
    }

    public static DataSource getInstance() {
        return InnerClass.instance;
    }

    public synchronized Conn getConnection() {
        Conn conn = null;
        if(conns.peek()!=null&&!conns.peek().isInUse()){
            conn = getConnectionFromQueue();
        }else if(conns.size() < maxActive){
            createConnection(increment);
            conn = getConnectionFromQueue();
        }else {
            System.err.println("暂时没有空闲连接，获取失败!");
        }
        return conn;
    }

    private Conn getConnectionFromQueue(){
        Conn conn = conns.poll();
        conn.setInUse(true);
        conns.add(conn);
        return conn;
    }

    private void createConnection(int num){
        for(int i = 0; i < num; i++){
            try {
                Connection conn = DriverManager.getConnection(url,username,password);
                conns.addFirst(new Conn(conn,false));
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public ConcurrentLinkedDeque<Conn> getConns() {
        return conns;
    }

    public void closeConnection(Conn conn){
        conns.remove(conn);
        conn.setInUse(false);
        conns.addFirst(conn);
    }
}
