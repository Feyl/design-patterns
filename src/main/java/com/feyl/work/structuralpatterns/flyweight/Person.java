package com.feyl.work.structuralpatterns.flyweight;

/**
 * @author Feyl
 * @date 2021/10/26 17:40
 */
public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
