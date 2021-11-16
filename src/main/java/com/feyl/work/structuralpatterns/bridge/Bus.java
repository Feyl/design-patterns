package com.feyl.work.structuralpatterns.bridge;

/**
 * @author Feyl
 * @date 2021/10/12 16:20
 */
public class Bus extends Vehicle{

    @Override
    public void travel() {
        road.load("公交车");
        System.out.println("驶向远方...");
    }
}
