package com.ecnu.service.impl;

import com.ecnu.mapper.UserbMapper;
import com.ecnu.model.UserbEntity;
import com.ecnu.service.UserbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 63050 on 2017/8/27.
 */
@Service
public class UserbServiceImpl implements UserbService {

    @Autowired
    private UserbMapper userbMapper;

    @Override
    public void add(UserbEntity entity) {
        UserbEntity userbEntity = new UserbEntity();
        userbMapper.add(userbEntity);
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void updateById(Integer id) {

    }

    @Override
    public void selectById(Integer id) {

    }

    @Override
    public List<UserbEntity> selectByAttr(String Attr) {
        return null;
    }
}
