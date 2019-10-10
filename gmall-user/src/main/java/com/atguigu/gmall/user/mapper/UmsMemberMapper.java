package com.atguigu.gmall.user.mapper;

import com.atguigu.gmall.user.bean.UmsMember;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UmsMemberMapper {

    @Select("select * from ums_member where id =#{id}")
    UmsMember getUmsMemberById(@Param("id") Integer id);

}
