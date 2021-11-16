package com.feyl.work.structuralpatterns.decorator;

/**
 * @author Feyl
 * @date 2021/10/19 16:47
 */
public class Client {
    public static void main(String[] args) {
        Printable textPrinter = new TextPrinter();
        Printable multiplyLinePrinterDecorator = new MultiplyLinePrinterDecorator(textPrinter);
        Printable andSymbolLinePrinterDecorator = new AndSymbolLinePrinterDecorator(multiplyLinePrinterDecorator);
        Printable modSymbolLinePrinterDecorator = new ModSymbolLinePrinterDecorator(andSymbolLinePrinterDecorator);
        modSymbolLinePrinterDecorator.print("文本文件内容...");
    }
}
