package cn.wolfcode.crm.qo;


import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


@Getter
@Setter
public class PotenialCustomerReportObject{
    private String groupType = "seller.name";

    public String groupName(){
        if(groupType == "seller.name" ){
            return "员工";
        }else if(groupType == "DATE_FORMAT(c.input_time, '%Y')"){
            return "年";

        }else if(groupType == "DATE_FORMAT(c.input_time, '%Y-%m')"){
            return "月";
        }else{
            return "日";
        }
    }



    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date beginDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endDate;

    private String keyword;


}
