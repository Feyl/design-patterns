package com.feyl.work.creationalpatterns.abstractfactory;

/**
 * @author Feyl
 * @date 2021/9/28 15:46
 */
public class BreadFactory implements MainsFactory {
    @Override
    public Food offerFood() {
        return new Bread();
    }

    @Override
    public Tableware offerTableware() {
        return new Knife();
    }
}
