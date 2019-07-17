package cn.wolfcode.crm.domain;

import com.alibaba.fastjson.JSON;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;

@Setter
@Getter
@ToString
public class Systemdictionaryitem {
    private Long id;

    private Long parent_id;

    private String title;

    private Integer sequence;


    public String getJsonString(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("id", id);
        map.put("parent_id", parent_id);
        map.put("title", title);
        map.put("sequence", sequence);
        return JSON.toJSONString(map);
    }

}