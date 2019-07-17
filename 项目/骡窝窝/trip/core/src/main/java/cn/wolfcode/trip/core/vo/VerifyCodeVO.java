package cn.wolfcode.trip.core.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class VerifyCodeVO {
    private String phone;
    private String code;
    private Date sendTime;
}
