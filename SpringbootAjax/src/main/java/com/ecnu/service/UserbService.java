package com.ecnu.service;

import com.ecnu.model.UserbEntity;

import java.util.List;

/**
 * Created by 63050 on 2017/8/27.
 */
public interface UserbService {

    void add(UserbEntity entity);
    void deleteById(Integer id);
    void updateById(Integer id);
    void selectById(Integer id);
    List<UserbEntity>selectByAttr(String Attr);



}
