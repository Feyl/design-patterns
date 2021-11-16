package com.feyl.work.behavioralpatterns.interpreter;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author Feyl
 * @date 2021/11/14 18:38
 */

@NoArgsConstructor
@AllArgsConstructor
public class ValueNode extends AbstractNode{
    private String value;

    @Override
    public int interpret() {
        return Integer.parseInt(value);
    }
}
