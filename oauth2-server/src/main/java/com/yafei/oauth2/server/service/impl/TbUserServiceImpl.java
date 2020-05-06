package com.yafei.oauth2.server.service.impl;

import com.yafei.oauth2.server.domain.TbPermission;
import com.yafei.oauth2.server.domain.TbUser;
import com.yafei.oauth2.server.mapper.TbUserMapper;
import com.yafei.oauth2.server.service.TbUserService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbUserServiceImpl implements TbUserService {

    @Resource
    private TbUserMapper tbUserMapper;

    @Override
    public TbUser getByUsername(String username) {
        Example example = new Example(TbUser.class);
        example.createCriteria().andEqualTo("username", username);
        return tbUserMapper.selectOneByExample(example);
    }

}
