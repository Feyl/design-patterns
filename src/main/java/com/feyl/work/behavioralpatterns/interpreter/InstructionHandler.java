package com.feyl.work.behavioralpatterns.interpreter;

import java.util.Stack;

/**
 * @author Feyl
 * @date 2021/11/14 18:34
 */
public class InstructionHandler {
    private AbstractNode node;
    public void handle(String instruction){
        String[] nodes = instruction.split(" ");
        AbstractNode left;
        String operate = null;
        Stack<AbstractNode> stack = new Stack<>();
        Stack<AbstractNode> mdStack = new Stack<>();
        if("+".equals(nodes[1])||"-".equals(nodes[1])){
            stack.push(new ValueNode(nodes[0]));
        }else{
            mdStack.push(new ValueNode(nodes[0]));
        }
        for (int i = 1; i < nodes.length; i++) {
            if(("+".equals(nodes[i])||"-".equals(nodes[i]))&&!mdStack.isEmpty()){ //处理 */ -> +-
                if(!stack.isEmpty()){ // 3 * 5 - 6 + 4
                    stack.push(new ExpressionNode(stack.pop(),operate,mdStack.pop()));
                }else{
                    stack.push(mdStack.pop());
                }
                i--;
                continue;
            }
            if("*".equals(nodes[i])||"/".equals(nodes[i])){ // */ -> */
                left = mdStack.pop();
                mdStack.push(new ExpressionNode(left,nodes[i],new ValueNode(nodes[++i])));
            }else if(i+2>=nodes.length||"+".equals(nodes[i+2])||"-".equals(nodes[i+2])){ // +- -> +-
                left = stack.pop();
                stack.push(new ExpressionNode(left,nodes[i],new ValueNode(nodes[++i])));
            }else{ //处理 +- -> */
                operate = nodes[i];
                mdStack.push(new ValueNode(nodes[++i]));
            }
        }

        if(!mdStack.isEmpty()){
            if(!stack.isEmpty()){ // 3 * 5 - 6
                stack.push(new ExpressionNode(stack.pop(),operate,mdStack.pop()));
                node = stack.pop();
            }else{
                node = mdStack.pop();
            }
        }else{
            node = stack.pop();
        }

    }
    public int output(){
        return node.interpret();
    }
}
