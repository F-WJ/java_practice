/**
 * ���䲻�ܴ���60
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
 * ���ҵ����˸��๹����public RuntimeException(String message); public
 * RuntimeException(String message, Throwable cause)
 */