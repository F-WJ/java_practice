package cn.wolfcode.trip.api.controller;


import cn.wolfcode.trip.core.domain.User;
import cn.wolfcode.trip.core.service.IUserService;
import cn.wolfcode.trip.core.util.JsonResult;
import cn.wolfcode.trip.core.util.UploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("images")
public class ImageContrloller {

    @Autowired
    private IUserService userService;

    @PostMapping
    public Map<String, Object> upload(MultipartFile file){
        HashMap<String, Object> map = new HashMap<>();
        try {
            //调用保存图片方法
            String url = UploadUtil.uploadAli(file);
            map.put("status", 1);
            map.put("url", url);
        }catch (Exception e){
            e.printStackTrace();
            map.put("status", 0);
            map.put("msg", "上传失败，请重试");
        }
        return map;
    }


}
