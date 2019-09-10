package com.ls.ad.service;

import com.ls.ad.exception.AdException;
import com.ls.ad.vo.CreateUserRequest;
import com.ls.ad.vo.CreateUserResponse;

/**
 * Created by Qinyi.
 */
public interface IUserService {

    /**
     * <h2>创建用户</h2>
     * */
    CreateUserResponse createUser(CreateUserRequest request)
            throws AdException;
}
