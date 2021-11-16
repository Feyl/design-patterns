package com.feyl.work.behavioralpatterns.mediator;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Feyl
 * @date 2021/11/16 15:48
 */
@Data
public abstract class Person {
    protected String name;
    protected String identity;
    protected Mediator mediator;

    public Person(String name, String identity, Mediator mediator) {
        this.name = name;
        this.identity = identity;
        this.mediator = mediator;
    }

    public void listen(String identity, String speaker, String msg){
        System.out.println("<"+this.name+">接收到了"+speaker+"("+identity+")的信息："+msg);
    }

    public void speak(String msg){
        mediator.operate(this,msg);
    }
}
