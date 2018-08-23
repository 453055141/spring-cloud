package com.zk.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zk.entity.master.Members;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zengkai
 * @since 2018-08-22
 */
public interface IMembersService extends IService<Members> {

    public int delete(Integer id);
}
