package cn.wolfcode.springmvc.web.controller;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//自定义一个全局时间参数处理控制器（类上贴上@ControllerAdvice, 全局设置效果（AOP））
@ControllerAdvice
public class DateControllerAdvice {
//	//1.创建一个方法（贴上@InitBinder，方法参数为WebDataBinder，）
	@InitBinder
	public void dateBinder(WebDataBinder binder){
		//2.创建SimpleDateFormat对象（参数为时间格式）
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		//3.创建CustomDateEditor对象(继承的接口是PropertyEditor)（参数为SimpleDateFormat对象, 参数是否可以为空）
		CustomDateEditor cd = new CustomDateEditor(sf, true);
		//4.调用WebDataBinder类中的registerCustomEditor方法（参数为时间字节码对象， CustomDateEditor对象）
		//注意Date导包问题，如果用了sql的，会报错， 一定要使用util包
		binder.registerCustomEditor(Date.class, cd);
		
//		//简写版（调用）
//		//直接调用WebDataBinder类中的addCustomFormatter方法（参数为DateFormat类（参数为时间格式））
//		binder.addCustomFormatter(new DateFormatter("yyyy-MM-dd"));
		
	}
	
	
	
	
}
