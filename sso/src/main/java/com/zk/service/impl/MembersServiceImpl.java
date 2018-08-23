package com.zk.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zk.entity.master.Members;
import com.zk.mapper.master.MembersMapper;
import com.zk.mapper.slave.MembersTwoMapper;
import com.zk.service.IMembersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zengkai
 * @since 2018-08-22
 */
@Service
public class MembersServiceImpl extends ServiceImpl<MembersMapper, Members> implements IMembersService {

    @Autowired
    private MembersMapper membersMapper;

    @Autowired
    private MembersTwoMapper membersTwoMapper;

    @Override
    public int delete(Integer id) {
        int a=membersMapper.deleteById(8);
        int b=membersTwoMapper.deleteById(4);
        int c=8/0;
        return 1;
    }
}
