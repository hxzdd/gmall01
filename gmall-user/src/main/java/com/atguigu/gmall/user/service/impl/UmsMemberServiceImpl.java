package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.mapper.UmsMemberMapper;
import com.atguigu.gmall.user.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UmsMemberServiceImpl implements UmsMemberService{

    @Autowired
    UmsMemberMapper umsMemberMapper;

    @Override
    public UmsMember getUmsMemberById(Integer id) {
        return umsMemberMapper.getUmsMemberById(id);
    }
}
