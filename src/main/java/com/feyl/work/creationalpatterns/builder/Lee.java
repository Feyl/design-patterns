package com.feyl.work.creationalpatterns.builder;

/**
 * @author Feyl
 * @date 2021/9/28 16:46
 */
public class Lee extends LoveLetterBuilder {
    @Override
    void writeCall() {
        letter.setCall("Lee girl friend:");
    }

    @Override
    void writePraise() {
        letter.setPraise("You are so kind and beautiful~");
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
