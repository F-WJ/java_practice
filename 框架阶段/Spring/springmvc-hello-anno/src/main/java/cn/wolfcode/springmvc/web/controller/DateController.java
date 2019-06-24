package cn.wolfcode.springmvc.web.controller;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.wolfcode.springmvc.domain.User;

@Controller
public class DateController {
	
	
	//接收时间参数，使用@DateTimeFormat(注意添加pattern的参数时间格式)
	@RequestMapping("d1")
	public ModelAndView d1(@DateTimeFormat(pattern = "yyyy-MM-dd")Date d){
		System.out.println(d);
		return null;
		
	}
	
	//使用枚举
	@RequestMapping("d2")
	public ModelAndView d2(@DateTimeFormat(iso = ISO.DATE)Date d){
		System.out.println(d.toLocaleString());
		return null;
	}
	
	//通常是把时间参数设置在某一类的上
	@RequestMapping("d3")
	public ModelAndView d3(User u){
		System.out.println(u.getD());
		return null;
		
		
	}
	
	//演示全局时间处理
	@RequestMapping("d4")
	public ModelAndView d4(Date d){
		System.out.println(d);
		return null;
	}
	
	
	//jsp显示Date类型数据演示（注意导入依赖包taglibs-standard-spec（1,2,5）和 taglibs-standard-impl）
	@RequestMapping("d5")
	public String d5(Model model){
		model.addAttribute("date", new Date());
		return "forward:WEB-INF/resp/a.jsp";
		
	}
	
}
