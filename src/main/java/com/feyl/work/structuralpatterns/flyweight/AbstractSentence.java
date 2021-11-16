package com.feyl.work.structuralpatterns.flyweight;

/**
 * @author Feyl
 * @date 2021/10/26 17:41
 */
public abstract class AbstractSentence {
    public abstract String getContent();

    public void sent(Person person){
        System.out.println(person.getName()+","+getContent());
    }
}
