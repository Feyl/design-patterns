package com.feyl.work.behavioralpatterns.interpreter;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author Feyl
 * @date 2021/11/14 18:40
 */
@NoArgsConstructor
@AllArgsConstructor
public class ExpressionNode extends AbstractNode{
    private AbstractNode left;
    private String operate;
    private AbstractNode right;

    @Override
    public int interpret() {
        if("+".equals(operate)){
            return left.interpret()+right.interpret();
        }else if("-".equals(operate)){
            return left.interpret()-right.interpret();
        }else if("*".equals(operate)){
            return left.interpret()*right.interpret();
        }else if("/".equals(operate)){
            return left.interpret()/right.interpret();
        }else{
            throw new RuntimeException("操作符有误，解释失败!");
        }
    }
}
