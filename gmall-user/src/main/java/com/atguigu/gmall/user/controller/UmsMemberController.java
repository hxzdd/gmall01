package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.request.RequestId;
import com.atguigu.gmall.user.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/member")
public class UmsMemberController {

    @Autowired
    UmsMemberService umsMemberService;

    @ResponseBody
    @RequestMapping(value = "/getUmsMemberById",method = RequestMethod.POST)
    public UmsMember getUmsMemberById(@RequestBody RequestId id)
    {
        return umsMemberService.getUmsMemberById(id.getId());
    }




}
