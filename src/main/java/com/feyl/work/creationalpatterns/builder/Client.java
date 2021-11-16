package com.feyl.work.creationalpatterns.builder;

import com.feyl.work.common.XMLUtil;

/**
 * @author Feyl
 * @date 2021/9/28 16:57
 */
public class Client {
    public static void main(String[] args) {
        LoveLetterController controller = new LoveLetterController();
        LoveLetterBuilder builder = (LoveLetterBuilder) XMLUtil.getBean();
        LoverLetter letter = controller.construct(builder);
        System.out.println(letter);
    }
}
