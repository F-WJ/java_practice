package cn.wolfcode.springmvc.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResponseCotroller {
	
	@RequestMapping("/h2")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//创建视图模型对象
		ModelAndView modelAndView = new ModelAndView();
		//往模型对象存放数据（返回数据）
		modelAndView.addObject("msg", "a");
		//设置视图名称（访问哪个资源）
		modelAndView.setViewName("/WEB-INF/a.jsp");
		return modelAndView;
	}
	
	
	@RequestMapping("resp1")
	public String r2(Model model) {
		//往模型对象存放数据（返回数据）
		model.addAttribute("msg", "123");
		//设置视图名称（访问哪个资源）
		return "a";
	}
	
	@RequestMapping("resp2")
	public ModelAndView r2(){
		ModelAndView modelAndView = new ModelAndView();
		//往模型对象存放数据（返回数据）
		modelAndView.addObject("msg", "a");
		//设置视图名称（访问哪个资源）
		modelAndView.setViewName("a");
		return modelAndView;
	}
	
	@RequestMapping("resp3")
	public String r3(Model model){
		//设置值
		model.addAttribute("msg", "123");
		//跳转(注意路径要相对路径，视图解析器的前缀和后缀设置会失效)
		return "forward:/WEB-INF/resp/a.jsp";
	}
	
	@RequestMapping("resp4")
	public String r4(Model model){
		//重定向
		return "redirect:/static/c.html";
	}
	
	

}
