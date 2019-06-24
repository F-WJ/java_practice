package cn.onedull.spring.tx;



import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class TransactionManager {
	//事务
	//开启事务
	public void begin(JoinPoint jp){
		System.out.println("获取代理对象" + jp.getThis().getClass());
		System.out.println("获取目标对象" + jp.getTarget().getClass());
		System.out.println("获取被增强方法的参数"  + Arrays.toString(jp.getArgs()));
		System.out.println("获取当前连接点签名" + jp.getSignature());
		System.out.println("获取当前连接点类型" + jp.getKind());
		System.out.println("开启事务");
	}
	
	//提交事务
	public void commit(){
		System.out.println("提交事务");
	}
	
	//回滚事务
	public void rollback(Throwable tw){
		System.out.println("回滚事务" + tw);
	}

	//环绕增强
	public Object aroundDemo(ProceedingJoinPoint jp) throws Throwable{
		System.out.println("before...");
		Object pe = jp.proceed();
		System.out.println("after...");
		return pe;
	}

}
