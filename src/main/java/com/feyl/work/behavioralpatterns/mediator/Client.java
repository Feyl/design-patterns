package com.feyl.work.behavioralpatterns.mediator;

/**
 * @author Feyl
 * @date 2021/11/16 16:31
 */
public class Client {
    public static void main(String[] args) {
        Mediator mediator = new PassOnMsgMediator();
        Student s1 = new Student("小李", "学生", mediator);
        Student s2 = new Student("小王", "学生", mediator);
        Teacher t1 = new Teacher("小张", "教师", mediator);
        Teacher t2 = new Teacher("小刘", "教师", mediator);
        mediator.register(s1);
        mediator.register(s2);
        mediator.register(t1);
        mediator.register(t2);
        s1.speak("我是小李");
        t1.speak("我是小张");
    }
}
