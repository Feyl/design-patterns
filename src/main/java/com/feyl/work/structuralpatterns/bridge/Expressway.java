package com.feyl.work.structuralpatterns.bridge;

/**
 * @author Feyl
 * @date 2021/10/12 16:18
 */
public class Expressway implements Road{
    @Override
    public void load(String vehicle) {
        System.out.println(vehicle+"行驶到高速公路上...");
    }
}
