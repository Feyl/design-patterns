package com.feyl.work.structuralpatterns.proxy;

/**
 * @author Feyl
 * @date 2021/10/26 18:38
 */
public class FileSystem implements Operable{
    @Override
    public void edit(String addr) {
        System.out.println("编辑文件"+addr+"成功。");
    }

    @Override
    public void delete(String addr) {
        System.out.println("删除文件"+addr+"成功。");
    }
}
