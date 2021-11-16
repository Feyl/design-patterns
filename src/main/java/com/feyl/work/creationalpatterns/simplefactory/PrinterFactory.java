package com.feyl.work.creationalpatterns.simplefactory;

/**
 * @author Feyl
 * @date 2021/9/28 14:48
 */
public class PrinterFactory {
    private static Printer printer = null;

    public static Printer getPrinter(String symbol){
        if("*".equals(symbol)){
            printer = new PrinterImpla();
            System.out.println("初始化打印机 - * ");
        }else if("-".equals(symbol)){
            printer = new PrinterImplb();
            System.out.println("初始化打印机 - - ");
        }else{
            System.err.println("输入的标志有误，初始化打印机失败");
        }
        return printer;
    }
}
