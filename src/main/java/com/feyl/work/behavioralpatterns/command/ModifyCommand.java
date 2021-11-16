package com.feyl.work.behavioralpatterns.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Feyl
 * @date 2021/11/2 19:38
 */
@Data
@AllArgsConstructor
public class ModifyCommand extends Command{
    private String oldContent;
    private String newContent;

    public ModifyCommand(TextEditor editor) {
        super(editor);
    }

    @Override
    public void execute(String content) {
        String[] contents = content.split(" ");
        this.oldContent = contents[0];
        this.newContent = contents[1];
        String str = editor.getContent();///默认替换所有目标内容
        String modifiedStr = str.replaceAll(oldContent, newContent);
        editor.setContent(modifiedStr);
        System.out.println("编辑成功："+editor.getContent());
    }

    @Override
    public void undo() {
        String str = editor.getContent();
        String modifiedStr = str.replaceAll(newContent, oldContent);
        editor.setContent(modifiedStr);
        System.out.println("撤销（编辑）成功："+editor.getContent());
    }

    @Override
    public void redo() {
        String str = editor.getContent();///默认替换所有目标内容
        String modifiedStr = str.replaceAll(oldContent, newContent);
        editor.setContent(modifiedStr);
        System.out.println("重做（编辑）成功："+editor.getContent());
    }

}
