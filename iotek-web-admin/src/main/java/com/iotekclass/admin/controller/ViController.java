package com.iotekclass.admin.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.iotekclass.service.user.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hmc on 16-10-14.
 * Copyright (c) 2016 hmc.
 */
@Controller
@RequestMapping
public class ViController {
    @Reference(version = "1.0.0")
    UserService userService;

    @RequestMapping(value = "/index")
    public String index() {
        System.out.println(userService.findByAccount("wfb"));
        return "index";
    }
}
