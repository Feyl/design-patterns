package com.feyl.work.creationalpatterns.abstractfactory;

import com.feyl.work.common.XMLUtil;

/**
 * @author Feyl
 * @date 2021/9/28 15:58
 */
public class Client {
    public static void main(String[] args) {
        MainsFactory factory = (MainsFactory) XMLUtil.getBean();
        Food food = factory.offerFood();
        Tableware tableware = factory.offerTableware();
        System.out.println(factory);
        System.out.println(food);
        System.out.println(tableware);
    }
}
