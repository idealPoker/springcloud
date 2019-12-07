package com.lwq.spring.cloud.alibaba.business.controller;

import com.lwq.spring.cloud.alibaba.business.BusinessAdminFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusinessAdminController {

    @Autowired
    private BusinessAdminFeign adminFeign;

    @GetMapping(value = "hi")
    public String sayHi(){

       return adminFeign.sayHi();
    }

}
