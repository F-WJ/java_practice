package cn.odedull.practice1;
/**年龄不能低于18
 * 
 * 
 * 
 */
public class LowAgeException extends RuntimeException{
	public LowAgeException(String message) {
		super(message);
	}
	public LowAgeException(String message, Throwable cause) {
		
	}
}


/*
 * 并且调用了父类构造器public RuntimeException(String message); public
 * RuntimeException(String message, Throwable cause)
 */