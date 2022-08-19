package com.psol.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@ResponseBody //声明返回的数据是直接写给浏览器的，@ResponseBody 和 @Controller 也可以合并写成@RestController
@Controller

/*
这是一个控制类，需要与主配置类放在同一个包下（自动包扫描）
若不在同一个包下，需要手动为主配置类添加@SpringBootApplication(scanBasePackages = "包名")
springboot整个应用的配置统一放在application.properties文件中，极大降低了配置的难度
*/

public class Hello {
    //主配置类运行后，跳转到http://localhost:8080/hello可查看效果
    @RequestMapping("/hello")
    public String handle01(){
        return "hello,spring boot";
    }
}
