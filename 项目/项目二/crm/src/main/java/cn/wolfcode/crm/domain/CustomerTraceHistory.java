package cn.wolfcode.crm.domain;

import com.alibaba.fastjson.JSON;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.security.PublicKey;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

@Getter
@Setter
@ToString
public class CustomerTraceHistory {
    private Long id;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date traceTime;

    private String traceDetails;

    private Long traceTypeId;

    private Integer traceResult;

    private String remark;

    private Long customerId;

    private Long inputUserId;

    private Date inputTime;

    private Integer type;

    //客户
    private Customer customer;
    //跟进方式
    private Systemdictionaryitem traceType;
    //录入人
    private Employee inputUser;

    public String getJsonResult(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("id", id);
        map.put("customerId", customerId);
        map.put("customerName", customer.getName());
        map.put("traceDetails", traceDetails);
        map.put("traceTypeId", traceTypeId);
        map.put("traceResult", traceResult);
        map.put("remark", remark);
        //时间转换
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        map.put("traceTime", sdf.format(traceTime));
        return JSON.toJSONString(map);
    }

    //优中差
    public String getResultType(){
        switch (traceResult){
            case 3:
                return "优";
            case 2:
                return "中";
            case 1:
                return "差";
            default:
                return "保密";
        }
    }

    public String getStatusType() {
        switch (type) {
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

}