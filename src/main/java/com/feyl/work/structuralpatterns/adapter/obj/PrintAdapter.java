package com.feyl.work.structuralpatterns.adapter.obj;

/**
 * @author Feyl
 * @date 2021/10/12 15:28
 */
public class PrintAdapter implements XPrintIntf {
    private Printer printer;

    public PrintAdapter(){
        printer = new Printer();
    }

    @Override
    public void printReport(String content) {
        printer.print(content);
    }
}
