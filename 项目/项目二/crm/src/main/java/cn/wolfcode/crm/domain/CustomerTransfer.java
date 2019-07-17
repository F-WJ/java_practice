package cn.wolfcode.crm.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class CustomerTransfer {
    private Long id;

    private Long customerId;

    private Long operatorId;

    private Date operateTime;

    private Long oldsellerId;

    private Long newsellerId;

    private String reason;

    //客户
    private Customer customer;
    //操作人
    private Employee operator;
    //旧营销人
    private Employee oldSeller;
    //新营销人
    private Employee newSeller;



}