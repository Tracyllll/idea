package cn.bdqn.service;

import cn.bdqn.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @Package: cn.bdqn.service
 * @Description:
 * @Author kk
 * @Create 2021年05月06日 15时00分40秒
 */
@Service
public class UserServiceImpl {

    @Autowired
    private UserMapper userMapper;

    public Map<String,Object> dologin(String username, String password){
        return userMapper.dologin(username,password);
    }
}
