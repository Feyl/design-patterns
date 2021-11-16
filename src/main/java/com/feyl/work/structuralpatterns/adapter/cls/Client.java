package com.feyl.work.structuralpatterns.adapter.cls;

import com.feyl.work.common.XMLUtil;

/**
 * @author Feyl
 * @date 2021/10/12 15:37
 */
public class Client {
    public static void main(String[] args) {
        XPrintIntf xPrintIntf = (XPrintIntf) XMLUtil.getBean();
        xPrintIntf.printReport("XXX季度报表（类适配器）");
    }
}
