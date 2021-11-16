package com.feyl.work.creationalpatterns.factory;

import com.feyl.work.common.XMLUtil;

/**
 * @author Feyl
 * @date 2021/9/28 15:27
 */
public class Client {
    public static void main(String[] args) {
//        PrinterFactory printerFactory = new PrinterImplaFactory();
        PrinterFactory printerFactory = (PrinterFactory) XMLUtil.getBean();
        Printer printer = printerFactory.createPrinter();
        System.out.println(printer);
        printer.print();
    }
}
