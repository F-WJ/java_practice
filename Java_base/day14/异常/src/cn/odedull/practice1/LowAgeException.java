package cn.odedull.practice1;
/**���䲻�ܵ���18
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
 * ���ҵ����˸��๹����public RuntimeException(String message); public
 * RuntimeException(String message, Throwable cause)
 */