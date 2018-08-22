package com.zk.controller;


import com.zk.mapper.master.MembersMapper;
import com.zk.mapper.slave.MembersTwoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zengkai
 * @since 2018-08-22
 */
@Controller
@RequestMapping("/members")
public class MembersController {

    @Autowired
    private MembersMapper membersMapper;

    @Autowired
    private MembersTwoMapper membersTwoMapper;

    @GetMapping("test")
    public String test(){
        int a=membersMapper.deleteById(8);
        int b=membersTwoMapper.deleteById(4);
        int c=8/0;
        return "ok";
    }

}

