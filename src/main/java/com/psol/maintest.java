package com.psol;

import com.psol.bean.User;
import com.psol.config.myconfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

/*
通过@SpringBootApplication声明为springboot应用
这是springboot的主配置类，springboot程序由此启动
在主配置类中 要定义一个注解 @SpringBootApplication ，和一个 run 方法
 */
@SpringBootApplication
public class maintest {
    public static void main(String[] args) {

        //获取IOC容器
        ConfigurableApplicationContext run=SpringApplication.run(maintest.class,args);



//        //查看容器中的组件
//        String[] names=run.getBeanDefinitionNames();
//        for(String name : names){
//            System.out.println(name);
//        }
//
//        //从容器中获取组件
//        User user = run.getBean("user01",User.class);
//        System.out.println(user);
//
//        //由于配置类本身也是组件，可以获取配置类，再通过调用配置类中的方法获取组件
//        myconfig bean=run.getBean(myconfig.class);
//        User user2=bean.user01();
//        System.out.println(user2);

    }
}



/*
localhost:
springboot不仅拥有依赖管理的特性，帮助开发者管理各种依赖项的版本，springboot还有自动配置的特性：

自动装配好springMVC，引入全套组件并装配

自动配好Web常见功能，处理字符编码问题，配置好web开发的常用场景

具有默认的包结构，主程序所在包及其下面的所有子包里面的组件都会被默认扫描

各种配置具有默认值，按需加载所有自动配置项
 */
