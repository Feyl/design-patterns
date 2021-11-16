package com.feyl.work.behavioralpatterns.chainofresponsibility;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Feyl
 * @date 2021/11/2 15:49
 */
@Data
@NoArgsConstructor
public abstract class Department {
    private String name;
    protected Department successor;
    protected int recruitingNumber;
    protected List<Person> employee;


    public Department(String name, int recruitingNumber) {
        this.name = name;
        this.recruitingNumber = recruitingNumber;
        this.employee = new ArrayList<>();
    }

    public abstract boolean recruit(Person person);
    public abstract boolean isQualifiedForEmployment(Person person);

}
