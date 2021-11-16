package com.feyl.work.structuralpatterns.adapter.obj;

import com.feyl.work.common.XMLUtil;

/**
 * @author Feyl
 * @date 2021/10/12 15:37
 */
public class Client {
    public static void main(String[] args) {
        XPrintIntf xPrintIntf = (XPrintIntf) XMLUtil.getBean();
        xPrintIntf.printReport("XXX年度报表（对象适配器）");
    }
}
