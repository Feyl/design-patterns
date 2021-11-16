package com.feyl.work.behavioralpatterns.mediator;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Feyl
 * @date 2021/11/16 15:49
 */
public class Student extends Person{

    public Student(String name, String identity, Mediator mediator) {
        super(name, identity, mediator);
    }
}
