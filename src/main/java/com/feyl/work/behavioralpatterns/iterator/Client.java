package com.feyl.work.behavioralpatterns.iterator;

import java.util.List;
import java.util.ArrayList;

/**
 * @author Feyl
 * @date 2021/11/14 23:47
 */
public class Client {
    public static void main(String[] args) {
        List<Object> objs = new ArrayList<>();
        objs.add(new Student("同学一","软件工程一班"));
        objs.add(new Student("同学二","软件工程一班"));
        objs.add(new Teacher("老师一","人工智能学院"));
        objs.add(new Teacher("老师二","计算机学院"));
        objs.add(new Student("同学三","软件工程二班"));
        objs.add(new Teacher("老师三","人工智能学院"));
        objs.add(new Teacher("老师四","计算机学院"));
        objs.add(new Student("同学四","软件工程二班"));
        
        
        AbstractObjList objList = new ObjList(objs);
        AbstractIterator iter = objList.createIterator();
        while(iter.hasNextStudent()){
            System.out.println(iter.nextStudent());
        }
        System.out.println("------------------------------------------");
        while(iter.hasNextObj()){
            System.out.println(iter.nextObj());
        }
    }
}
