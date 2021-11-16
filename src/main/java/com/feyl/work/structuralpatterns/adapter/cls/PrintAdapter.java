package com.feyl.work.structuralpatterns.adapter.cls;

/**
 * @author Feyl
 * @date 2021/10/12 15:35
 */
public class PrintAdapter extends Printer implements XPrintIntf {
    @Override
    public void printReport(String content) {
        print(content);
    }
}
