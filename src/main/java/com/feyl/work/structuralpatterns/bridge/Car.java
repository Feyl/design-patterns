package com.feyl.work.structuralpatterns.bridge;

/**
 * @author Feyl
 * @date 2021/10/12 16:19
 */
public class Car extends Vehicle{

    @Override
    public void travel() {
        road.load("汽车");
        System.out.println("驶向远方...");
    }
}
