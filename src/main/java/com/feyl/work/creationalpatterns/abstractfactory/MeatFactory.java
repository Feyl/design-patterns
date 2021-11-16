package com.feyl.work.creationalpatterns.abstractfactory;

/**
 * @author Feyl
 * @date 2021/9/28 15:57
 */
public class MeatFactory implements MainsFactory {
    @Override
    public Food offerFood() {
        return new Meat();
    }

    @Override
    public Tableware offerTableware() {
        return new Fork();
    }
}
