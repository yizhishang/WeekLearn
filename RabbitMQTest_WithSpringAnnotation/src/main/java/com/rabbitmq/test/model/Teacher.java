package com.rabbitmq.test.model;

import lombok.*;

/**
 * Created by wuhuachuan on 16/3/30.
 */

@Data
@NoArgsConstructor
@ToString
public class Teacher
{
    private String teacherName;

    public Teacher(String teacherName)
    {
        this.teacherName = teacherName;
    }
}
