package com.feyl.work.structuralpatterns.bridge;

/**
 * @author Feyl
 * @date 2021/10/12 16:17
 */
public class Highway implements Road{
    @Override
    public void load(String vehicle) {
        System.out.println(vehicle+"行驶到公路上...");
    }
}
