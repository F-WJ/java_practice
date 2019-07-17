package cn.wolfcode.trip.api.controller;


import cn.wolfcode.trip.core.domain.User;
import cn.wolfcode.trip.core.mapper.UserMapper;
import cn.wolfcode.trip.core.service.IUserService;
import cn.wolfcode.trip.core.util.JsonResult;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserContrloller {

    @Autowired
    private IUserService userService;


    @PostMapping
    public JsonResult register(User user, String verifyCode){
        JsonResult result = new JsonResult();
        try {
            //调用注册方法
            userService.register(user, verifyCode);
            return result;
        }catch (Exception e){
//            e.printStackTrace();
            result.mark(e.getMessage());
            return result;
        }
    }

    @PutMapping("{id}")
    public JsonResult update(User user){
        JsonResult result = new JsonResult();
        try{
            userService.update(user);
            //回显修改后的用户信息
            User userUpdate = userService.listUser(user.getId());
            System.out.println(userUpdate.getId());
            result.setUser(userUpdate);
            return result;
        }catch (Exception e){
            e.printStackTrace();
            return result;
        }
    }

}
