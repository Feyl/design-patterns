package com.feyl.work.structuralpatterns.composite;

import java.util.List;
import java.util.ArrayList;
/**
 * @author Feyl
 * @date 2021/10/19 15:25
 */
public class Folder extends AbstractFile{
    List<AbstractFile> children;

    public Folder(String filename) {
        this.filename = filename;
        children = new ArrayList<>();
    }

    @Override
    boolean add(AbstractFile file) {
        return children.add(file);
    }

    @Override
    boolean remove(AbstractFile file) {
        return children.remove(file);
    }

    @Override
    AbstractFile get(int i) {
        return children.get(i);
    }

    @Override
    void printCurFileName(int spaceNum) {
        printSpace(spaceNum);
        System.out.println(filename);
        for(AbstractFile file:children){
            file.printCurFileName(spaceNum+1);
        }
    }
}
