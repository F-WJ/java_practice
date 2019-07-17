package cn.wolfcode.crm.qo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class CustomerObject extends QueryObject{
    //关键字
    private String keyword;

    //客户状态
    private Integer status = -1;

    //
    private Long sellerId = -1L;

}
