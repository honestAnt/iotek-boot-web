package com.iotekclass.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 *@description 项目启动类
 *
 *@author honestAnt
 *@date   2016/10/13 13:17
 *@since V1.0
 *
 */
@Controller
@EnableWebMvc
@SpringBootApplication
@ImportResource("dubbo/applicationContext-dubbo-provider.xml")
public class Application extends WebMvcConfigurerAdapter {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
