package com.feyl.work.structuralpatterns.proxy;

import java.text.SimpleDateFormat;

/**
 * @author Feyl
 * @date 2021/10/26 18:57
 */
public class ProxyFileSystem implements Operable{
    private FileSystem fileSystem;
    private LogRecorder logRecorder;
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");

    public ProxyFileSystem() {
        fileSystem = new FileSystem();
        logRecorder = new LogRecorder();
    }

    @Override
    public void edit(String addr) {
        fileSystem.edit(addr);
        logRecorder.recordLog(addr,sdf.format(System.currentTimeMillis())+"\t修改文件"+addr);
    }

    @Override
    public void delete(String addr) {
        fileSystem.delete(addr);
        logRecorder.recordLog(addr,sdf.format(System.currentTimeMillis())+"\t删除文件"+addr);
    }
}
