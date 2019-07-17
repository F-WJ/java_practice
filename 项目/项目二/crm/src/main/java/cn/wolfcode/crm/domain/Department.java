package cn.wolfcode.crm.domain;



import com.alibaba.fastjson.JSON;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;



@Getter
@Setter
@ToString
public class Department {
    private Long id;

    private String name;

    private String sn;

    //给编辑页面的数据
    public String getJsonString(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("id", id);
        map.put("name", name);
        map.put("sn", sn);
        // 使用了
        return JSON.toJSONString(map);
    }



}