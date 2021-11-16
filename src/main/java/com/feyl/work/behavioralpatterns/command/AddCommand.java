package com.feyl.work.behavioralpatterns.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Feyl
 * @date 2021/11/2 19:37
 */
@Data
@AllArgsConstructor
public class AddCommand extends Command{
    private String content;
    private int len = -1;

    public AddCommand(TextEditor editor) {
        super(editor);
    }


    @Override
    public void execute(String content) {
        this.content = content;
        len = content.length();
        editor.setContent(editor.getContent()+content);
        System.out.println("添加成功："+editor.getContent());
    }

    @Override
    public void undo() {
        String str = editor.getContent();
        editor.setContent(str.substring(0,str.length() - len));
        System.out.println("撤销（添加）成功："+editor.getContent());
    }

    @Override
    public void redo() {
        execute(content);
        System.out.println("重做（添加）成功："+editor.getContent());
    }
}
