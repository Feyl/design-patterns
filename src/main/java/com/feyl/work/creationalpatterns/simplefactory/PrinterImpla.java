package com.feyl.work.creationalpatterns.simplefactory;

/**
 * @author Feyl
 * @date 2021/9/28 14:47
 */
public class PrinterImpla implements Printer {

    @Override
    public void print() {
        System.out.println("打印分隔符:\n************************");
    }
}
