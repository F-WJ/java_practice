package cn.wolfcode.crm.qo;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CustomerTraceHistoryObject extends QueryObject {
    //当前销售员id
    private Long sellerId;

}
