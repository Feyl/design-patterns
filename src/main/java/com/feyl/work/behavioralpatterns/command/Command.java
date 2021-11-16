package com.feyl.work.behavioralpatterns.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Feyl
 * @date 2021/11/2 19:35
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Command {
    TextEditor editor;
    public abstract void execute(String content);
    public abstract void undo();
    public abstract void redo();
}
