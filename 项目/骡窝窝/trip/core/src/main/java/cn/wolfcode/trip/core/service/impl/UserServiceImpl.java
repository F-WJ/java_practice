package cn.wolfcode.trip.core.service.impl;

import cn.wolfcode.trip.core.domain.User;
import cn.wolfcode.trip.core.mapper.UserMapper;
import cn.wolfcode.trip.core.service.IUserService;
import cn.wolfcode.trip.core.util.Constants;
import cn.wolfcode.trip.core.util.DateUtil;
import cn.wolfcode.trip.core.util.UserContext;
import cn.wolfcode.trip.core.vo.VerifyCodeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import sun.security.util.Password;

import javax.servlet.http.HttpSession;
import java.util.Date;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void register(User user, String verifyCode) {
        Assert.hasLength(verifyCode, "验证码不能为空");
        Assert.hasLength(user.getPhone(), "手机不能为空");
        Assert.hasLength(user.getPassword(), "密码不能为空");

        //查询在数据库中是否有此用户
        User user1 = userMapper.selectByPhone(user.getPhone());
        if(user1 != null){
            throw new RuntimeException("手机号已注册");
        }

        //当前手机号，验证码和时间限制判断
        HttpSession session = UserContext.getSession();
        VerifyCodeVO vo = (VerifyCodeVO)session.getAttribute("verifyCodeVO");
        if(vo != null
                && vo.getPhone().equals(user.getPhone())
                && vo.getCode().equals(verifyCode)
                && DateUtil.getDateBetween(new Date(), vo.getSendTime()) < Constants.VERIFY_CODE_VALID_TIME
        ){
            //设置头像设置
            user.setHeadImgUrl("/img/user/head.jpg");
            user.setCoverImgUrl("/img/user/bg.jpeg");
            //调用usermapper的创建用户的方法注册用户
            userMapper.insert(user);

        }else{
            throw new RuntimeException("验证码过期，请重试");
        }

    }

    @Override
    public User login(String account, String password) {
        return userMapper.selectByAccountAndPassword(account, password);

    }

    @Override
    public void update(User user) {
        userMapper.updateByPrimaryKey(user);

    }

    @Override
    public User listUser(Long id) {
        return userMapper.selectByUserId(id);
    }
}
