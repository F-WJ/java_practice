package cn.wolfcode.springmvc.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloCotroller {
	
	@RequestMapping("/h1")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//创建视图模型对象
		ModelAndView modelAndView = new ModelAndView();
		//往模型对象存放数据（返回数据）
		modelAndView.addObject("msg", "a");
		//设置视图名称（访问哪个资源）
		modelAndView.setViewName("/WEB-INF/a.jsp");
		return modelAndView;
	}

}
