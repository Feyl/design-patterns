package com.feyl.work.behavioralpatterns.mediator;

/**
 * @author Feyl
 * @date 2021/11/16 16:33
 */
public class PassOnMsgMediator extends Mediator{

    @Override
    public void operate(Person speaker, String msg) {
        for (Person p : people) {
            if (p!=speaker){
                p.listen(speaker.getIdentity(),speaker.getName(),msg);
            }
        }
    }
}
