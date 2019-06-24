package cn.wolfcode.springmvc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cn.wolfcode.springmvc.domain.User;

@Controller
public class RequestCotroller {
	
	//处理简单类型请求参数
	@RequestMapping("/req1")
	public ModelAndView req1(String username, int age){
		//获取信息
		System.out.println(username + ": " + age);
		return null;
	}
	
	//设置请求参数名@RequestParam（设置请求过来的参数名）
	@RequestMapping("req2")
	public ModelAndView req2(@RequestParam("username")String name, int age){
		//获取信息
		System.out.println(name + ": " + age);
		return null;
	}
	
	//设置请求参数不是必须要获取,但还是要传递值，只是不接收（@RequestParam的参数require=false）
	@RequestMapping("req3")
	public ModelAndView req3(String username, @RequestParam(required=false)int age){
		System.out.println(username );
		return null;
		
	}
	
	//乱码问题（get方式中文问题，在配置tomcat依赖的时候就设置了，post方法问题使用spring过滤器CharacterEncodingFilter）
	
	
	//处理复合类型请求参数
	//数组类型（http://127.0.0.1/req4?l=12&l=34）
	@RequestMapping("req4")
	public ModelAndView req3(Long[] l){
		System.out.println(l);
		return null;
		
	}
	
	//List类型参数(http://127.0.0.1/req5?ids[0]=12&ids[2]=34)
	@RequestMapping("req5")
	public ModelAndView req5(User u){
		System.err.println(u.getIds());
		return null;
	}
	
	//jeanbean类型参数(http://127.0.0.1/req6?username=12)
	@RequestMapping("req6")
	public ModelAndView req6(User u){
		System.err.println(u);
		return null;
		
	}
	
	//浏览器请求对象中的关联对象的属性（多对一）(http://127.0.0.1/req7?dept.id=121)(首字母不区分大小写)
	@RequestMapping("req7")
	public ModelAndView req7(User u){
		System.out.println(u.getDept());
		return null;
		
		
	}
}
