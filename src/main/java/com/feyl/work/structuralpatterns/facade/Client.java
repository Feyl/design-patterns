package com.feyl.work.structuralpatterns.facade;

import com.feyl.work.common.XMLUtil;

/**
 * @author Feyl
 * @date 2021/10/26 17:08
 */
public class Client {
    public static void main(String[] args) {
        AbstractDataReportGenerator generator = (AbstractDataReportGenerator) XMLUtil.getBean();
        generator.generatingDataReport("数据报表");
    }
}
