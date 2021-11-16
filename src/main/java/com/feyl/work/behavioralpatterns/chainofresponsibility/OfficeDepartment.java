package com.feyl.work.behavioralpatterns.chainofresponsibility;

/**
 * @author Feyl
 * @date 2021/11/2 15:49
 */
//办公室部门
public class OfficeDepartment extends Department{

    public OfficeDepartment(String name, int recruitingNumber) {
        super(name, recruitingNumber);
    }


    @Override
    public boolean isQualifiedForEmployment(Person person) {
        return "女".equals(person.getSex())&&person.getEnglishScore()>=85;
    }

    @Override
    public boolean recruit(Person person) {
        if(isQualifiedForEmployment(person)){
            this.employee.add(person);
            this.recruitingNumber--;
            System.out.println(person.getName()+"被"+this.getName()+"录用。");
            return true;
        }else if (this.successor!=null){
            return this.successor.recruit(person);
        }else{
            System.out.println(person.getName()+"未被录用。");
            return false;
        }
    }
}
