package com.feyl.work.structuralpatterns.composite;

/**
 * @author Feyl
 * @date 2021/10/19 15:37
 */
public class Client {
    public static void main(String[] args) {
        Folder aaa = new Folder("aaa");
        Folder bbb = new Folder("bbb");
        Folder ccc = new Folder("ccc");
        Folder ddd = new Folder("ddd");
        TxtFile y = new TxtFile("y");
        DocFile xx = new DocFile("xx");
        PPTFile z = new PPTFile("z");
        aaa.add(bbb);
        aaa.add(xx);
        aaa.add(ccc);
        bbb.add(y);
        ccc.add(ddd);
        ddd.add(z);
        aaa.printCurFileName(0);
    }
}
