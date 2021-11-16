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
public class DeleteCommand extends Command{
    private String content;
    private int index;
    private String prefix;
    private String suffix;
    public DeleteCommand(TextEditor editor) {
        super(editor);
    }

    @Override
    public void execute(String content) {
        this.content = content;
        String str = editor.getContent();
        index = str.lastIndexOf(content);
        if(index!=-1){
            prefix = str.substring(0,index);//默认删除最后一次出现的目标字符串
            suffix = str.substring(index+content.length());
            editor.setContent(prefix+suffix);
            System.out.println("删除成功："+editor.getContent());
        }else{
            System.err.println("待删除的内容不存在");
        }
    }


    @Override
    public void undo() {
        if (index!=-1){
            editor.setContent(prefix+content+suffix);
            System.out.println("撤销（删除）成功："+editor.getContent());
        }
    }

    @Override
    public void redo() {
        editor.setContent(prefix+suffix);
        System.out.println("重做（删除）成功："+editor.getContent());
    }

}
