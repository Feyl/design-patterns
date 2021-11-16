package com.feyl.work.structuralpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Feyl
 * @date 2021/10/26 17:36
 */
public class SentenceFactory {
    private volatile static SentenceFactory factory;
    private static Map<String,AbstractSentence> sentences = new HashMap<>();

    private SentenceFactory() {}

    public static SentenceFactory getInstance() {
        if (factory == null){//双重锁
            synchronized(SentenceFactory.class){
                if (factory==null){
                    factory = new SentenceFactory();
                }
            }
        }
        return factory;
    }

    public static AbstractSentence getSentence(String type){
        if(sentences.containsKey(type)){
            return sentences.get(type);
        }else{
            if("greet".equals(type)){
                GreetingSentence greetingSentence = new GreetingSentence();
                sentences.put("geet",greetingSentence);
                return greetingSentence;
            }else if("bless".equals(type)){
                BlessingSentence blessingSentence = new BlessingSentence();
                sentences.put("bless",blessingSentence);
                return blessingSentence;
            }else{
                System.err.println("该类型的句子不在常用句子内!");
                return null;
            }
        }
    }
}
