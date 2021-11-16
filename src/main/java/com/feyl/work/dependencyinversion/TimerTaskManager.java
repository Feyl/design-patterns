package com.feyl.work.dependencyinversion;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Feyl
 * @date 2021/9/14 16:32
 */
public class TimerTaskManager {
    public Map<String,SwTimerTask> taskMap = new HashMap<>();
    private  SwTimer timer = new SwTimer();
    private static TimerTaskManager instance = null;

    private TimerTaskManager() {
    }

    public static TimerTaskManager getInstance(){
        if (instance == null) {
            synchronized(TimerTaskManager.class){
                if (instance ==null){
                    instance = new TimerTaskManager();
                }
            }
        }
        return instance;
    }


    public boolean addTask(SwTimerTask t){
        if(taskMap.containsKey(t.getCode())){
            return false;
        }
        taskMap.put(t.getCode(),t);
        timer.schedule(t);
        return true;
    }

    public boolean deleteTaskByCode(String taskCode,boolean isCancel){
        SwTimerTask t = taskMap.get(taskCode);
        if(t!=null){
            if(isCancel){
                t.cancel();
           }
            taskMap.remove(t.getCode());
            if(taskMap.isEmpty()){
                this.timer.cancel();
            }
            return true;
        }
        return false;
    }


}
