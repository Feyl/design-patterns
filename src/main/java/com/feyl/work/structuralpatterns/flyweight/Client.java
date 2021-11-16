package com.feyl.work.structuralpatterns.flyweight;

/**
 * @author Feyl
 * @date 2021/10/26 17:52
 */
public class Client {
    public static void main(String[] args) {
        SentenceFactory sentenceFactory = SentenceFactory.getInstance();
        AbstractSentence greet = sentenceFactory.getSentence("greet");
        AbstractSentence bless = sentenceFactory.getSentence("bless");
        greet.sent(new Person("Anonymous"));
        bless.sent(new Person("Anonymous"));
        greet.sent(new Person("Flow"));
        bless.sent(new Person("Flow"));
    }
}
