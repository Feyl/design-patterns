package com.feyl.work.creationalpatterns.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Feyl
 * @date 2021/9/28 17:12
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dog extends Pet {
    private String name;
    private int age;
}
