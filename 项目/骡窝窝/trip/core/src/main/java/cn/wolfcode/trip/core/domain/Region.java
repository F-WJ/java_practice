package cn.wolfcode.trip.core.domain;


import com.alibaba.fastjson.JSON;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class Region {
    private Long id;

    private String name;

    private Long parentId;

    //status 1 推荐 0 不推荐
    private Integer state = 0;

    private String parentName;



    public String result(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("id", id);
        map.put("name", name);
        map.put("parentId", parentId);
        map.put("parentName", parentName);
        map.put("state", state);
        return JSON.toJSONString(map);
    }


}