package cn.wolfcode.crm.domain;

import com.alibaba.fastjson.JSON;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;

@Setter
@Getter
@ToString
public class Systemdictionary {
    private Long id;

    private String sn;

    private String title;

    private String intro;

    public String getJsonString(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("id", id);
        map.put("sn", sn);
        map.put("title", title);
        map.put("intro", intro);
        return JSON.toJSONString(map);

    }
}

