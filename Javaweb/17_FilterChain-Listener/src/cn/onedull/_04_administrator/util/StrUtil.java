package cn.onedull._04_administrator.util;

public class StrUtil {
	private StrUtil(){}
	public static boolean hasLength(String str){
		if(str == null || "".equals(str.trim())){
			return false;
		}
		return true;
		
	}
}
