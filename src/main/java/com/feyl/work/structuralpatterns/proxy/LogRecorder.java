package com.feyl.work.structuralpatterns.proxy;

/**
 * @author Feyl
 * @date 2021/10/26 18:54
 */
public class LogRecorder {
    public boolean recordLog(String addr,String logContent){
        //可以先检查文件是否存在，若不存在则打印抛异常或打印错误返回 false。
        System.out.println("记录日志："+logContent);
        return true;
    }
}
