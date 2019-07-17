package cn.wolfcode.trip.core.util;


import cn.wolfcode.trip.core.domain.User;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class JsonResult {
    private Boolean success = true;
    private String msg;
    private User user;

    public JsonResult(){

    }


    public JsonResult(boolean result, String msg) {
        this.success = result;
        this.msg = msg;
    }


    public void mark(String msg) {
        this.success = false;
        this.msg = msg;
    }
}
