package cn.wolfcode.trip.api.controller;


import cn.wolfcode.trip.core.domain.User;
import cn.wolfcode.trip.core.service.IUserService;
import cn.wolfcode.trip.core.util.JsonResult;
import cn.wolfcode.trip.core.util.UserContext;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("sessions")
public class SessionContrloller {

    @Autowired
    private IUserService userService;

    @PostMapping
    public JsonResult login(String account, String password){
        JsonResult result = new JsonResult();
        User user = userService.login(account, password);
        if(user != null) {
            result.setUser(user);
            return result;
        }else{
            result.mark("手机号或密码错误，请重新输入");
            return result;
        }
    }

    @DeleteMapping
    public void logout(HttpServletResponse response){
        //清除session
        UserContext.getSession().invalidate();
        response.setStatus(204);
    }

}
