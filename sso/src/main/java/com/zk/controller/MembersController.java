package com.zk.controller;


import com.zk.entity.master.Members;
import com.zk.mapper.master.MembersMapper;
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

    @GetMapping("test")
    public String test(){
        membersMapper.deleteByPrimaryKey(4);
        return "ok";
    }

    @GetMapping("test1")
    public Members test1(){
        Members members = membersMapper.selectByPrimaryKey(3);
        return members;
    }

}

