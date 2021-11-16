package com.feyl.work.creationalpatterns.builder;

/**
 * @author Feyl
 * @date 2021/9/28 16:19
 */
public abstract class LoveLetterBuilder{
    LoverLetter letter = new LoverLetter();

    abstract void writeCall();
    abstract void writePraise();
    abstract void writeConfession();
    abstract void writeDating();

    public LoverLetter writeLetter(){
        return letter;
    }
}
