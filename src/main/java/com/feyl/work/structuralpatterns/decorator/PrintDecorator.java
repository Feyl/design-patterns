package com.feyl.work.structuralpatterns.decorator;

/**
 * @author Feyl
 * @date 2021/10/19 16:24
 */
//抽象 Decorator
public abstract class PrintDecorator implements Printable {
    private Printable printable;

    public PrintDecorator(Printable printable) {
        this.printable = printable;
    }

    @Override
    public void print(String content) {
        printable.print(content);
    }

}
