package com.feyl.work.behavioralpatterns.command;

import com.feyl.work.common.XMLUtil;

import java.util.Scanner;

/**
 * @author Feyl
 * @date 2021/11/2 20:13
 */
public class Client {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("输入你想进行的操作：\n1.添加文本\n2.删除文本\n3.编辑文本\n4.撤销\n5.重做\n0.退出");
            int operate = scanner.nextInt();
            switch (operate){
                case 1:
                    System.out.print("输入要添加的文本：");
                    editor.addContent(scanner.next());
                    break;
                case 2:
                    System.out.println("输入要删除的文本：");
                    editor.deleteContent(scanner.next());
                    break;
                case 3:
                    System.out.println("输入被替换的文本：");
                    String beReplacedStr = scanner.next();
                    System.out.println("输入替换文本：");
                    String replaceStr = scanner.next();
                    editor.editContent(beReplacedStr+" "+replaceStr);
                    break;
                case 4:
                    editor.undo();
                    break;
                case 5:
                    editor.redo();
                    break;
                case 0:
                    System.out.println("退出成功...");
                    return;
                default:
                    System.out.println("输入的操作选项不存在");
            }
        }
    }
}
