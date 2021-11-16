package com.feyl.work.dependencyinversion;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Feyl
 * @date 2021/9/14 17:19
 */
public class PrintCurSysTime extends SwTimerTask{
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a E");

    public PrintCurSysTime(String code) {
        super(code);
    }

    public PrintCurSysTime(String code, long amount, Date firstTime, long delay, long period, TimerTaskManager manager) {
        super(code, amount, firstTime, delay, period, manager);
    }

    @Override
    public void execute() {
        System.out.println(sdf.format(System.currentTimeMillis()));
    }
}
