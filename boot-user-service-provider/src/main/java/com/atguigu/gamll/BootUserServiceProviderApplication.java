package com.atguigu.gamll;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * 1、导入依赖 ：
 *            1).导入dubbo-starter
 *            2).导入dubbo的其他依赖
 *
 * SpringBoot与dubbo整合的三种方式：
 *  1.导入dubbo-starter，在application.properties属性配置，使用@Service【暴露服务】使用@Reference【引用服务】
 *  2.保留dubbo xml配置文件；
 *      导入dubbo-starter,使用@ImportResource导入dubbo的配置文件即可
 *  3.使用注解API的方式
 *      将每个组件手动创建到让容器中
 */

/*@EnableDubbo //1.开启基于注解的dubbo功能*/
/*@ImportResource(locations = "provider.xml")*/
@EnableDubbo(scanBasePackages ="com.atguigu.gamll")
@SpringBootApplication
public class BootUserServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootUserServiceProviderApplication.class, args);
    }

}

