package com.feyl.work.dependencyinversion;

/**
 * @author Feyl
 * @date 2021/9/14 18:19
 */
public class Run {
    public static void main(String[] args) {
        TimerTaskManager manager = TimerTaskManager.getInstance();
        manager.addTask(new Student("456",10,null,100,100,manager,"anonymous",20));
        manager.addTask(new PrintCurSysTime("123",10,null,100,500,manager));
    }
}
