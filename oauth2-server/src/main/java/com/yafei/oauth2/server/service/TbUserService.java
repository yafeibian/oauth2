package com.yafei.oauth2.server.service;

import com.yafei.oauth2.server.domain.TbPermission;
import com.yafei.oauth2.server.domain.TbUser;

import java.util.List;

public interface TbUserService {
    default TbUser getByUsername(String username) {
        return null;
    }

    default List<TbUser> selectAa() {
        return null;
    }
}
