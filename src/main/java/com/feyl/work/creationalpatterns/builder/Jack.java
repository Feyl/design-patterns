package com.feyl.work.creationalpatterns.builder;

/**
 * @author Feyl
 * @date 2021/9/28 16:50
 */
public class Jack extends LoveLetterBuilder {
    @Override
    void writeCall() {
        letter.setCall("Jack girl friend:");
    }

    @Override
    void writePraise() {
        letter.setPraise("You are so kind and loveliness~");
    }

    @Override
    void writeConfession() {
        letter.setConfession("I have a crush on you~");
    }

    @Override
    void writeDating() {
        letter.setDating("Can we have a date?");
    }
}
