package cn.wolfcode.crm.domain;

import com.alibaba.fastjson.JSON;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.HashMap;

@Setter
@Getter
@ToString
public class Customer {
    private Long id;
    private String name;
    private Integer age;
    private Integer gender;
    private String tel;
    private String qq;
    private Integer status;

    //性别
    public String getGenderType(){
        return gender == 0 ? "男" : "女";
    }

    //客户状态设置别名
    public static final Integer STAUS_POTENIAL = 0;
    public static final Integer STAUS_FORMAL = 1;
    public static final Integer STAUS_POOL = 2;
    public static final Integer STAUS_FAILED = 3;
    public static final Integer STAUS_LOSS = 4;

    /**
     * 0 潜在客户
     * 1 正式客户
     * 2 资源池客户
     * 3 失败客户
     * 4 流失客户
     * @return
     */
    public String getStatusType(){
        switch (status){
            case 0:
                return "潜在客户";
            case 1:
                return "正式用户";
            case 2:
                return "资源池客户";
            case 3:
                return "失败客户";
            case 4:
                return "流失客户";
            default:
                return "适配客户失败，请联系后台管理员";

        }

    }

    //来源
    private Systemdictionaryitem source;
    //职业
    private Systemdictionaryitem job;

    //市场专员
    private Employee seller;


    private Long job_id;

    private Long source_id;

    private Long seller_id;

    private Long inputUser_id;

    private Date input_time;

    public String getJsonString(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("id", id);
        map.put("name", name);
        map.put("gender", gender);
        map.put("age", age);
        map.put("tel", tel);
        map.put("qq", qq);
        map.put("job_id", job_id);
        map.put("source_id", source_id);
        map.put("status", status);
        map.put("sellerId", seller_id);
        map.put("sellerName", seller.getName());
        return JSON.toJSONString(map);
    }




}