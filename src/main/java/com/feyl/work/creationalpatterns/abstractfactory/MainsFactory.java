package com.feyl.work.creationalpatterns.abstractfactory;

/**
 * @author Feyl
 * @date 2021/9/28 15:46
 */
public interface MainsFactory {
    Food offerFood();
    Tableware offerTableware();
}
