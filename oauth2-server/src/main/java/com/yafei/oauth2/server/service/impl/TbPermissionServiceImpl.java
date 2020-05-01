package com.yafei.oauth2.server.service.impl;

import com.yafei.oauth2.server.domain.TbPermission;
import com.yafei.oauth2.server.mapper.TbPermissionMapper;
import com.yafei.oauth2.server.service.TbPermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbPermissionServiceImpl implements TbPermissionService {

    @Resource
    private TbPermissionMapper tbPermissionMapper;

    @Override
    public List<TbPermission> selectByUserId(Long userId) {
        return tbPermissionMapper.selectLi(userId);
    }

    @Override
    public List<TbPermission> ll() {
        return tbPermissionMapper.selectAll();
    }


}
