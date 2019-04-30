/**
 * 年龄不能大于60
 */
package cn.odedull.practice1;

public class HighAgeException extends RuntimeException{
	public HighAgeException(String message) {
		super(message);
	}
	public HighAgeException(String message, Throwable cause) {
		
	}
}



/*
 * 并且调用了父类构造器public RuntimeException(String message); public
 * RuntimeException(String message, Throwable cause)
 */