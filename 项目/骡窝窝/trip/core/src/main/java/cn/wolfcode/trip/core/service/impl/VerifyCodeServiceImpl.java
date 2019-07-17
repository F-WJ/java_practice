package cn.wolfcode.trip.core.service.impl;

import cn.wolfcode.trip.core.service.IVerifyCodeService;
import cn.wolfcode.trip.core.util.Constants;
import cn.wolfcode.trip.core.util.DateUtil;
import cn.wolfcode.trip.core.util.UserContext;
import cn.wolfcode.trip.core.vo.VerifyCodeVO;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.UUID;


@Service
public class VerifyCodeServiceImpl implements IVerifyCodeService {
    @Override
    public void send(String phone) {
        //判断是否为空
        Assert.hasLength(phone, "手机号不能为空");
        //获取session中verifyCodeVO的值
        HttpSession session = UserContext.getSession();
        VerifyCodeVO verifyCodeVO = (VerifyCodeVO)session.getAttribute("verifyCodeVO");
        //判断发送时间是否已经过去了60秒
        if(verifyCodeVO == null || DateUtil.getDateBetween(verifyCodeVO.getSendTime(), new Date()) > Constants.VERIFY_CODE_INTERVAL_TIME){
            //生成验证码
            String code = UUID.randomUUID().toString().substring(0, 4);
            System.out.println(code);
            //发送短信
            //保存到session上
            VerifyCodeVO vo = new VerifyCodeVO();
            vo.setPhone(phone);
            vo.setCode(code);
            vo.setSendTime(new Date());
            session.setAttribute("verifyCodeVO", vo);
        }else{
            throw new RuntimeException("你操作太频繁，请稍后再试");
        }


    }
}
