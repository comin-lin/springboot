package com.psol.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


//引入LomBok插件后，通过注解@Data自动生成get和set方法，另外@ToString可自动重写toString方法
@ToString
@Data
@AllArgsConstructor //全参构造器：自动生成一个全属性的构造方法，实现所有属性的参数传入
@NoArgsConstructor //无参构造器：自动生成无参构造方法
public class User {
    private String name;
    private int age;
}
