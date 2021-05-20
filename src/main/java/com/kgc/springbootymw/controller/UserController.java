package com.kgc.springbootymw.controller;

import com.kgc.springbootymw.pojo.User;
import com.kgc.springbootymw.service.UserService;
import com.kgc.springbootymw.utils.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping(value = "login")
    @ResponseBody
    public RespBean Login(@RequestParam(value = "loginname") String loginname, @RequestParam(value = "password") String password){
        List<User> list = userService.UserLogin(loginname, password);

        return  RespBean.ok("登录成功",list);
    }

    @RequestMapping(value = "zhuce",method = RequestMethod.POST)
    public RespBean zhuce(User user){
       /* User user=new User();
        user.setLoginName(loginName);
        user.setUserName(userName);
        user.setPassword(password);
        user.setSex(sex);
        user.setIdentityCode(identityCode);
        user.setEmail(email);
        user.setMobile(mobile);
        user.setType(type);*/
        int i = userService.addUser(user);
if (i!=0){
    return RespBean.ok("注册成功",i);

}else {
    return RespBean.error("注册失败");
}
    }
}
