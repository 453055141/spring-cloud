package com.zk.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zk.entity.master.DUserLogin;
import com.zk.mapper.master.DUserLoginMapper;
import com.zk.service.IDUserLoginService;
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
public class DUserLoginServiceImpl extends ServiceImpl<DUserLoginMapper, DUserLogin> implements IDUserLoginService {

}
