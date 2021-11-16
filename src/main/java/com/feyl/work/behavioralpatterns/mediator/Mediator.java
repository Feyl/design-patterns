package com.feyl.work.behavioralpatterns.mediator;

import java.util.ArrayList;
import java.util.List;
/**
 * @author Feyl
 * @date 2021/11/16 15:47
 */
public abstract class Mediator {
    protected List<Person> people;

    public Mediator() {
        this.people = new ArrayList<>();
    }

    public void register(Person person){
        people.add(person);
    }

    public abstract void operate(Person speaker,String msg);
}
