package cn.wolfcode.springmvc.web.controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.util.FileCopyUtils;
import java.util.UUID;

@Controller
public class UploadCotroller {
	//4.获取ServletContext对象（使用注解@Autowried）
	@Autowired
	private ServletContext context;
	
	//5.创建一个上传的方法（贴上@RequestMapping）（参数为username， age， MultipartFile类）
	@RequestMapping("/upload")
	public ModelAndView MyUpload(String username, int age, MultipartFile pic) throws Exception{
		System.out.println(username);
		System.err.println(age);
		System.out.println(pic);
		//1.添加依赖（commons-fileupload（1.2.2））
		//2.设置jsp页面（前端部分）
		//3.配置mvc.xml配置文件（注意id名字， 固定的，设置上传解析器org.springframework.web.multipart.commons.CommonsMultipartResolver）
		
		//6.获取保存路径（调用ServletContext类的getRealPath方法（参数为保存文件夹相对路径名））
		String uploadDir = context.getRealPath("/static/upload");
		System.out.println(uploadDir);
		//7.获取文件后缀名（先获取文件名（通过MultipartFile类的getOriginalFilname方法，
		//	得到字符串之后，通过substring方法获取后缀名（参数为获取方法名后再使用String的ladtIndexOf方法（参数为.））））
		String suffix = pic.getOriginalFilename().substring(pic.getOriginalFilename().lastIndexOf("."));
		//8.保存数据到本地上（使用FileCOpeUtil类的copy方法（参数为参数源（MultipartFile.getInputStream，
		//	目标源（创建FileOutputStream（参数为保存地址，文件夹名字 + 随机号码（UUID）+ 后缀名 ）））））
		FileCopyUtils.copy(pic.getInputStream(), new FileOutputStream(uploadDir + "/" + UUID.randomUUID().toString() + suffix));
		
		return null;
		
	}

}
