package cn.wolfcode.crm.util;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class JsonResult {
    private Boolean success = true;
    private String msg;

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
