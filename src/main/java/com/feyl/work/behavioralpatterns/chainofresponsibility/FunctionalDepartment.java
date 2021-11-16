package com.feyl.work.behavioralpatterns.chainofresponsibility;

/**
 * @author Feyl
 * @date 2021/11/2 15:48
 */
//生产科
public class FunctionalDepartment extends Department{

    public FunctionalDepartment(String name, int recruitingNumber) {
        super(name, recruitingNumber);
    }


    @Override
    public boolean isQualifiedForEmployment(Person person) {
        return "女".equals(person.getSex())&&person.isCanDrive()&&person.getAverageScore()>=70;
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
