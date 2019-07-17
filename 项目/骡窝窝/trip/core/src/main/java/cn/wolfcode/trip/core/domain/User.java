package cn.wolfcode.trip.core.domain;

import lombok.Getter;
import lombok.Setter;


/**
 * 用户注册
 */
@Getter
@Setter
public class User {
    private Long id;

    private String email;

    private String nickName;

    private String password;

    private String place;

    private String headImgUrl;

    private Integer gender;

    private String coverImgUrl;

    private String sign;

    private String phone;


    //性别别名
    public static final int GENDER_SECRET = -1;
    public static final int GENDER_MAN = 1;
    public static final int GENDER_WOMAN = 0;


}