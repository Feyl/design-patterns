package com.feyl.work.structuralpatterns.proxy;

import com.feyl.work.common.XMLUtil;

/**
 * @author Feyl
 * @date 2021/10/26 19:01
 */
public class Client {
    public static void main(String[] args) {
        Operable operable = (Operable) XMLUtil.getBean();
        operable.delete("d:/xx.doc");
        operable.edit("d:/xx.doc");
    }
}
