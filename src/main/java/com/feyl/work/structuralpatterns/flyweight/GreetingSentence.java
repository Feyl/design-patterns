package com.feyl.work.structuralpatterns.flyweight;

/**
 * @author Feyl
 * @date 2021/10/26 17:40
 */
public class GreetingSentence extends AbstractSentence{
    @Override
    public String getContent() {
        return "你好呀！";
    }
}
