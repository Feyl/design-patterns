package com.feyl.work.behavioralpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Feyl
 * @date 2021/11/14 23:25
 */

public abstract class AbstractObjList {
    protected List<Object> objs = new ArrayList<>();

    public AbstractObjList(List<Object> objs) {
        this.objs = objs;
    }

    public void addObject(Object obj){
        objs.add(obj);
    }

    public void removeObject(Object obj){
        objs.remove(obj);
    }

    public List<Object> getObjs() {
        return objs;
    }

    public abstract AbstractIterator createIterator();
}
