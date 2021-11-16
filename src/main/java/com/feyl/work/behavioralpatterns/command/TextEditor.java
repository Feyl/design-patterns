package com.feyl.work.behavioralpatterns.command;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
/**
 * @author Feyl
 * @date 2021/11/2 19:34
 */
@Data
@AllArgsConstructor
public class TextEditor {
    private List<Command> commands;
    private int index; //当前指令在列表中的下标
    private String content;


    public TextEditor() {
        commands = new ArrayList<>();
        index = -1; //初始没有指令，下标为-1
        content = "";
    }


    public void addContent(String content){
        AddCommand addCommand = new AddCommand(this);
        addCommand.execute(content);
        addCommandInList(addCommand);

    }

    public void deleteContent(String content){
        DeleteCommand deleteCommand = new DeleteCommand(this);
        deleteCommand.execute(content);
        addCommandInList(deleteCommand);
    }

    public void editContent(String content){
        ModifyCommand modifyCommand = new ModifyCommand(this);
        modifyCommand.execute(content);
        addCommandInList(modifyCommand);
    }

    private void addCommandInList(Command command){
        for(int i = commands.size()-1;i>index;i--){
            commands.remove(i);
        }
        commands.add(command);
        index++;
    }


    public void undo(){
        Command command = commands.get(commands.size() - 1);
        command.undo();
        index--;
    }

    public void redo(){
        if(index<commands.size()-1){
            index++;
            Command command = commands.get(index);
            command.redo();
        }else{
            System.err.println("没有可以重做的操作");
        }
    }



/*    public void execute(String instruction){
        if(index<instructions.size()-1){
            for(int i=instructions.size()-1; i>index; i--){//移除撤销历史项
                instructions.remove(i);
            }
        }
        command.execute(instruction);
        instructions.add(instruction);
        index++;
    }

    public void undo(){
        command.undo(instructions.get(index--));
    }

    public void redo(){
        if(index<instructions.size()-1){
            command.execute(instructions.get(++index));
        }else{
            System.err.println("没有操作可以重做。");
        }
    }*/
}
