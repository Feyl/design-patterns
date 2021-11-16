package com.feyl.work.creationalpatterns.singleton;

import lombok.Data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Feyl
 * @date 2021/9/28 20:45
 */
@Data
public class Conn {
    private Connection conn;
    private boolean inUse;

    public Conn(Connection conn,boolean inUse){
        this.conn = conn;
        this.inUse = inUse;
    }

    public Statement statement() throws SQLException {
        return conn.createStatement();
    }

    public PreparedStatement preparedStatement(String sql) throws SQLException {
        return conn.prepareStatement(sql);
    }


    public void close(){
        DataSource.getInstance().closeConnection(this);
    }

}
