package com.feyl.work.behavioralpatterns.chainofresponsibility;

/**
 * @author Feyl
 * @date 2021/11/2 16:20
 */
public class Client {
    public static void main(String[] args) {
        PRDepartment prDepartment = new PRDepartment("公关部门", 1);
        OfficeDepartment officeDepartment = new OfficeDepartment("办公室部门", 2);
        FunctionalDepartment functionalDepartment = new FunctionalDepartment("生产科部门", 2);
        prDepartment.setSuccessor(officeDepartment);
        officeDepartment.setSuccessor(functionalDepartment);
        Person man = new Person("小李","男", 90, 90, true, true);
        Person woman = new Person("小张","女", 75, 90, true, true);
        Person woman2 = new Person("小刘","女", 80, 60, true, true);
        prDepartment.recruit(man);
        prDepartment.recruit(woman);
        prDepartment.recruit(woman2);
    }
}
