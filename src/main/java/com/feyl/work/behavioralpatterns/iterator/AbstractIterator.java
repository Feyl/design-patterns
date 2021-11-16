package com.feyl.work.behavioralpatterns.iterator;

/**
 * @author Feyl
 * @date 2021/11/14 23:30
 */
public interface AbstractIterator {
    boolean hasNextStudent();
    Object nextStudent();
    boolean hasNextObj();
    Object nextObj();
}
