package com.tomorrowcat.userapp.service.dubbo;

import com.tomorrowcat.userServiceApi.VO.UserVO;
import com.tomorrowcat.userServiceApi.service.UserService;

import com.tomorrowcat.userapp.domain.TUser;
import com.tomorrowcat.userapp.mapper.TUserMapper;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.BeanUtils;



import javax.annotation.Resource;

/**
 * @description:
 * @author: kim
 * @create: 2021-07-26 17:45
 * @version: 1.0.0
 */
@Service   //此处要使用dubbo的注解
public class UserServiceImpl implements UserService {
    @Resource
    private TUserMapper userMapper;

    /**
     * @description:  获取用户信息
     * @param: id
     * @return: UserVO
     */
    @Override
    public UserVO getUserById(int id) {
        TUser user = userMapper.selectByPrimaryKey(id);
        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(user, userVO);
      //  System.out.println("进入此方法");
        return userVO;
    }
}