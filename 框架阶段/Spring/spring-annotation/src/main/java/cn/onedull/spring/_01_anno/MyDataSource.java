package cn.onedull.spring._01_anno;



import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class MyDataSource {
	//初始化操作
	//scope注解（贴在类中）
	//postconstructor贴在方法中（表示init）
	//predestory表达销毁，贴在方法上
	
	@PostConstruct
	public void  init(){
		System.out.println("初始化");
	}
	
	@PreDestroy
	public void destory(){
		System.out.println("销毁");
	}
}
