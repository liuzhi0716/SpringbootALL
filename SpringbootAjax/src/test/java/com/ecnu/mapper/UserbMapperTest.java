package com.ecnu.mapper;

import com.ecnu.model.UserbEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by 63050 on 2017/8/27.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserbMapperTest {
    @Autowired
    private UserbMapper userbMapper;

    @Test
    public void addTest(){
        UserbEntity userbEntity = new UserbEntity("asad","zhaozhen","asdaf");
        userbMapper.add(userbEntity);
    }
}
