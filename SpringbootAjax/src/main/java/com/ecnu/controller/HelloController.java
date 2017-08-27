package com.ecnu.controller;

import com.ecnu.model.HelloEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2017/7/24.
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public HelloEntity hello(){
        HelloEntity entity = new HelloEntity(9999,"helloworld");
        return  entity;
    }
}
