package com.ecnu.back.controller;

import com.ecnu.model.UserbEntity;
import com.ecnu.service.UserbService;
import com.ecnu.service.impl.UserbServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 63050 on 2017/8/27.
 */
@RestController
public class BackUserbController {

    @Autowired
    private UserbServiceImpl userbServiceImpl;

    @RequestMapping(value="/userbadd")
    public void userbAdd(){
        UserbEntity userbEntity = new UserbEntity();
        userbServiceImpl.add(userbEntity);
    }
}
