package com.ecnu.mapper;

import com.ecnu.model.UserbEntity;
import org.apache.ibatis.annotations.Insert;

/**
 * Created by 63050 on 2017/8/23.
 */

public interface UserbMapper {

    @Insert("INSERT INTO userb(userb_name,userb_wxid,userb_scid) VALUE(#{name},#{wxid},#{scid})")
    void add(UserbEntity userbEntity);


}
