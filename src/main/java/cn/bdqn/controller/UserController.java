package cn.bdqn.controller;

import cn.bdqn.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Package: cn.bdqn.controller
 * @Description:
 * @Author kk
 * @Create 2021年05月06日 14时55分18秒
 */
@RestController
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("dologin")
    public Map<String,Object> dologin(String username,String password){
        return userService.dologin(username,password);
    }
}
