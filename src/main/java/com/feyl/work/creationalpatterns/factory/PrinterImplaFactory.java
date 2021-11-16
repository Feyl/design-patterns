package com.feyl.work.creationalpatterns.factory;

/**
 * @author Feyl
 * @date 2021/9/28 15:22
 */
public class PrinterImplaFactory implements PrinterFactory {
    @Override
    public Printer createPrinter() {
        return new PrinterImpla();
    }
}
