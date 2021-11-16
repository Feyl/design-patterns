package com.feyl.work.dependencyinversion;

import lombok.NoArgsConstructor;

import java.util.Timer;

/**
 * @author Feyl
 * @date 2021/9/14 16:31
 */
@NoArgsConstructor
public class SwTimer extends Timer {
    public void schedule(SwTimerTask t){
        if(t.getFirstTime()!=null){
            if(t.getPeriod()>0){
                this.schedule(t,t.getFirstTime(),t.getPeriod());
            }else{
                this.schedule(t,t.getFirstTime());
            }
        }else if(t.getDelay()>0){
            if(t.getPeriod()>0){
                this.schedule(t,t.getDelay(),t.getPeriod());
            }else{
                this.schedule(t,t.getDelay());
            }

        }
    }
}
