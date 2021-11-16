package com.feyl.work.structuralpatterns.decorator;

/**
 * @author Feyl
 * @date 2021/10/19 16:23
 */
public class TextPrinter implements Printable{
    @Override
    public void print(String content) {
        System.out.println(content);
    }
}
