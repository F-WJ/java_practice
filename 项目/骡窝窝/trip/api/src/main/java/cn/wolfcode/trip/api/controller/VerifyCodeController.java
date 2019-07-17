package cn.wolfcode.trip.api.controller;



import cn.wolfcode.trip.core.service.IVerifyCodeService;
import cn.wolfcode.trip.core.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("verifyCode")
public class VerifyCodeController {

    @Autowired
    private IVerifyCodeService verifyCodeService;

    @PostMapping
    public JsonResult send(String phone){
        JsonResult jsonResult = new JsonResult();
        try {
            //调用core项目的send方法
            verifyCodeService.send(phone);
            return jsonResult;
        }catch (Exception e){
//            e.printStackTrace();
            jsonResult.mark(e.getMessage());
            return jsonResult;
        }
    }
}
