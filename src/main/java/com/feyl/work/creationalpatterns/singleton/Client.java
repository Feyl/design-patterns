package com.feyl.work.creationalpatterns.singleton;

/**
 * @author Feyl
 * @date 2021/9/28 21:59
 */
public class Client {
    public static void main(String[] args) {
        DataSource ds = DataSourceFactory.createDataSource();
        for(int i = 0; i < 10; i++){
            Conn connection = ds.getConnection();
            System.out.println(connection);
            if (i>5){
                connection.close();
                connection = ds.getConnection();
            }
            System.out.println(connection);
        }
    }
}
