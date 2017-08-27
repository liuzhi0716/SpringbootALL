package com.ecnu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by admin on 2017/7/24.
 */
@SpringBootApplication
@MapperScan("com.ecnu.mapper")
public class SpringbootApplication {
    public static void main(String args[]){
        SpringApplication.run(SpringbootApplication.class,args);
    }
}
