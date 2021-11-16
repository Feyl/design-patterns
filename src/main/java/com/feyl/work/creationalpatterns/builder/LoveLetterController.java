package com.feyl.work.creationalpatterns.builder;

/**
 * @author Feyl
 * @date 2021/9/28 16:53
 */
public class LoveLetterController {
    public LoverLetter construct(LoveLetterBuilder builder){
        builder.writeCall();
        builder.writePraise();
        builder.writeConfession();
        builder.writeDating();
        return builder.writeLetter();
    }
}
