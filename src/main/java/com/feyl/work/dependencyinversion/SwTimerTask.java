package com.feyl.work.dependencyinversion;

import java.util.Date;
import java.util.TimerTask;
import java.util.UUID;

/**
 * @author Feyl
 * @date 2021/9/14 16:32
 */
public abstract class SwTimerTask extends TimerTask {
    private String code; // 任务的标识
    private long amount = -1; // 循环调用次数，为-1时无循环调用
    private Date firstTime = null; // 第一次执行时间
    private long delay = 0; // 延迟执行时间（若有firstDate则delay无效）
    private long period; // 连续执行任务之间的时间（以毫秒为单位）。
    private TimerTaskManager manager = null;


    public SwTimerTask(String code) {
        if (code==null||code.trim().equals("")){
            code = UUID.randomUUID().toString();
        }
        this.code = code;
    }

    public SwTimerTask(String code, long amount, Date firstTime, long delay, long period, TimerTaskManager manager) {
        if (code==null||code.trim().equals("")){
            code = UUID.randomUUID().toString();
        }
        this.code = code;
        this.amount = amount;
        this.firstTime = firstTime;
        this.delay = delay;
        this.period = period;
        this.manager = manager;
    }

    @Override
    public void run() {
        if (this.amount==-1){//如果标志位为-1，标识无限循环调用
            execute();
        }else if(this.amount==0){//在不为-1的情况下，执行完相应的次数后结束任务
            manager.deleteTaskByCode(this.code,true);
            manager = null;
//            System.out.println("结束了-------------------------------------------");
        }else if (amount<0){
            throw new RuntimeException("执行次数不能为-1（标志位）以外的负数！");
        }else{
            execute();
            this.amount--;
        }
    }

    public abstract void execute();


    public String getCode() {
        return code;
    }


    public long getAmount() {
        return amount;
    }

    public Date getFirstTime() {
        return firstTime;
    }

    public long getDelay() {
        return delay;
    }

    public long getPeriod() {
        return period;
    }

    public TimerTaskManager getManager() {
        return manager;
    }

    public SwTimerTask setAmount(long amount) {
        this.amount = amount;
        return  this;
    }

    public SwTimerTask setFirstTime(Date firstTime) {
        this.firstTime = firstTime;
        return  this;
    }

    public SwTimerTask setDelay(long delay) {
        this.delay = delay;
        return  this;
    }

    public SwTimerTask setPeriod(long period) {
        this.period = period;
        return  this;
    }

    public SwTimerTask setManager(TimerTaskManager manager) {
        this.manager = manager;
        return  this;
    }
}
