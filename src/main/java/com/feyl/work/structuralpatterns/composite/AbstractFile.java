package com.feyl.work.structuralpatterns.composite;

import java.awt.*;

/**
 * @author Feyl
 * @date 2021/10/19 15:17
 */
public abstract class AbstractFile {
    protected String filename;
    abstract boolean add(AbstractFile file);
    abstract boolean remove(AbstractFile file);
    abstract AbstractFile get(int i);
    abstract void printCurFileName(int spaceNum);
    void printSpace(int n){
        for (int i = 0; i < n; i++) {
            System.out.print("\t");
        }
    }
}
