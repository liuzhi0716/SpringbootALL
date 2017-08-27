package com.ecnu.back.controller;

import com.ecnu.mapper.UserbMapper;
import com.ecnu.model.UserbEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 63050 on 2017/8/23.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserbMapper userbMapper;

    @GetMapping(value = "add")
    public String addUser(){
        userbMapper.add(new UserbEntity("123","123","123"));
        System.out.print("add is ok");
        return "ok";
    }
}
