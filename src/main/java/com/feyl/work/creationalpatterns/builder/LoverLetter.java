package com.feyl.work.creationalpatterns.builder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Feyl
 * @date 2021/9/28 16:13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoverLetter {
    private String call;
    private String praise;
    private String confession;
    private String dating;
}
