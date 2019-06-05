package cn.onedull.smis.util;

public class strUtil {
	private strUtil(){}
	
	public static boolean hasLength(String str){
		if(str == null || "".equals(str.trim())){
			return false;
		}
		return true;	
	}
}
