package com.zk.service.impl;

import com.zk.entity.Members;
import com.zk.mapper.MembersMapper;
import com.zk.service.IMembersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zengkai
 * @since 2018-08-21
 */
@Service
public class MembersServiceImpl extends ServiceImpl<MembersMapper, Members> implements IMembersService {

}
