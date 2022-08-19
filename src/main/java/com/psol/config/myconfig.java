package com.psol.config;

import com.psol.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
配置类中里面使用@Bean标注在方法上可以为容器注册组件，默认为单例组件
配置类本身也是一个组件
*/
@Configuration //告诉springboot这是一个配置类
public class myconfig {

    @Bean//给容器添加组件，以方法名作为组件的id（若不使用方法名，应在Bean注解中写组件的自定义id）
    //返回类型就是组件类型，返回的值是组件在容器中的实例
    public User user01(){
        return new User("zhangsan",18);
    }

}

























