package com.feyl.work.creationalpatterns.singleton;

/**
 * @author Feyl
 * @date 2021/9/28 20:31
 */
public class DataSourceFactory {
    public static DataSource createDataSource(){
        return DataSource.getInstance();
    }
}
