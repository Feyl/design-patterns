package com.feyl.work.creationalpatterns.abstractfactory;

/**
 * @author Feyl
 * @date 2021/9/28 15:56
 */
public class MilkFactory implements MainsFactory {
    @Override
    public Food offerFood() {
        return new Milk();
    }

    @Override
    public Tableware offerTableware() {
        return new Spoon();
    }
}
