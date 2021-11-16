package com.feyl.work.creationalpatterns.simplefactory;

/**
 * @author Feyl
 * @date 2021/9/28 14:52
 */
public class Client {
    public static void main(String[] args) {
        Printer printer = PrinterFactory.getPrinter("*");
        printer.print();
        System.out.println(printer);
        printer = PrinterFactory.getPrinter("-");
        printer.print();
        System.out.println(printer);
    }
}
