package com.feyl.work.behavioralpatterns.interpreter;

/**
 * @author Feyl
 * @date 2021/11/14 20:43
 */
public class Client {
    public static void main(String[] args) {
        String instruction = "3 * 5 - 6 + 4 * 5 * 6 - 9";
        InstructionHandler instructionHandler = new InstructionHandler();
        instructionHandler.handle(instruction);
        System.out.println(instructionHandler.output());
    }
}
