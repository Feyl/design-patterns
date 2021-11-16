package com.feyl.work.structuralpatterns.bridge;

/**
 * @author Feyl
 * @date 2021/10/12 15:56
 */
public abstract class Vehicle {
    protected Road road;


    public void setRoad(Road road) {
        this.road = road;
    }

    public abstract void travel();
}
