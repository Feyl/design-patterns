package com.feyl.work.behavioralpatterns.chainofresponsibility;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Feyl
 * @date 2021/11/2 15:50
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String name;
    private String sex;
    private int englishScore;
    private int averageScore;
    private boolean isHealthy;
    private boolean canDrive;
}
