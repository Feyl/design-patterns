package com.feyl.work.behavioralpatterns.iterator;

import java.util.List;

/**
 * @author Feyl
 * @date 2021/11/14 23:30
 */
public class ObjList extends AbstractObjList{

    public ObjList(List<Object> objs) {
        super(objs);
    }

    @Override
    public AbstractIterator createIterator() {
        return new ObjIterator(this);
    }
}
