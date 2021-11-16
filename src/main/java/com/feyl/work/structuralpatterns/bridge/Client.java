package com.feyl.work.structuralpatterns.bridge;

/**
 * @author Feyl
 * @date 2021/10/12 16:27
 */
public class Client {
    public static void main(String[] args) {
        Vehicle vehicle = (Vehicle) XMLUtil.getBean("vehicle");
        Road road = (Road) XMLUtil.getBean("road");
        vehicle.setRoad(road);
        vehicle.travel();
    }
}
