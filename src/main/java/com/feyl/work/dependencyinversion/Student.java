package com.feyl.work.dependencyinversion;


import java.util.Date;

/**
 * @author Feyl
 * @date 2021/9/14 18:08
 */

public class Student extends SwTimerTask{
    private String name;
    private int age;

    public Student(String code) {
        super(code);
    }

    public Student(String code, long amount, Date firstTime, long delay, long period, TimerTaskManager manager, String name, int age) {
        super(code, amount, firstTime, delay, period, manager);
        this.name = name;
        this.age = age;
    }

    @Override
    public void execute() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                "} ";
    }
}
