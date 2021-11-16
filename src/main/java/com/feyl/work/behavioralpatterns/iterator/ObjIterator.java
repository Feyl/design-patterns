package com.feyl.work.behavioralpatterns.iterator;

import java.util.List;
/**
 * @author Feyl
 * @date 2021/11/14 23:31
 */
public class ObjIterator implements AbstractIterator{
    private List<Object> objs;
    private int stuCur;
    private int objCur;

    public ObjIterator(ObjList objList) {
        objs = objList.getObjs();
        stuCur = objCur = 0;
    }

    @Override
    public boolean hasNextStudent() {
        for(;stuCur<objs.size();stuCur++){
            if (objs.get(stuCur) instanceof Student){
                break;
            }
        }
        if(stuCur==objs.size()) return false;
        return true;
    }

    @Override
    public Object nextStudent() {
        if(hasNextStudent()){
            return objs.get(stuCur++);
        }
        return null;
    }

    @Override
    public boolean hasNextObj() {
        return objCur!=objs.size();
    }

    @Override
    public Object nextObj() {
        return objs.get(objCur++);
    }
}
