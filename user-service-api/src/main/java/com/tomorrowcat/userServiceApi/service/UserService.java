package com.tomorrowcat.userServiceApi.service;

import com.tomorrowcat.userServiceApi.VO.UserVO;

/**
 * @description:
 * @author: kim
 * @create: 2021-07-26 18:08
 * @version: 1.0.0
 */
public interface UserService {

    /**
     * @description:  通过id获取用户
     * @param: id
     * @return: UserVO
     */
    UserVO getUserById(int id);
}