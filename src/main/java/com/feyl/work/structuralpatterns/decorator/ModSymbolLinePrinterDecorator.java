package com.feyl.work.structuralpatterns.decorator;

/**
 * @author Feyl
 * @date 2021/10/19 16:46
 */
public class ModSymbolLinePrinterDecorator extends PrintDecorator{
    public ModSymbolLinePrinterDecorator(Printable printable) {
        super(printable);
    }

    @Override
    public void print(String content) {
        System.out.println("%%%%%%%%%%%%%%%%%");
        super.print(content);
        System.out.println("%%%%%%%%%%%%%%%%%");
    }
}
