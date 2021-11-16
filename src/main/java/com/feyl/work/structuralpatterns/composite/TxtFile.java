package com.feyl.work.structuralpatterns.composite;

/**
 * @author Feyl
 * @date 2021/10/19 15:22
 */
public class TxtFile extends AbstractFile{

    public TxtFile(String filename) {
        this.filename = filename;
    }

    @Override
    boolean add(AbstractFile file) {
        System.err.println("文件类型不可以存放子文件");
        return false;
    }

    @Override
    boolean remove(AbstractFile file) {
        System.err.println("文件类型不可以存放子文件");
        return false;
    }

    @Override
    AbstractFile get(int i) {
        System.err.println("文件类型不可以存放子文件");
        return null;
    }

    @Override
    void printCurFileName(int spaceNum) {
        printSpace(spaceNum);
        System.out.println(filename+".txt");
    }
}
