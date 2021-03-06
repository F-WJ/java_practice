package cn.wolfcode.trip.core.util;

import com.aliyun.oss.OSSClient;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.UUID;

/**
 * 文件上传工具
 */
public class UploadUtil {
	//阿里域名
	public static final String ALI_DOMAIN = "https://tripdemo.oss-cn-shenzhen.aliyuncs.com/";



	public static String uploadAli(MultipartFile file) throws Exception {
		//生成文件名称
		String uuid = UUID.randomUUID().toString();
		String orgFileName = file.getOriginalFilename();//获取真实文件名称 xxx.jpg
		String ext= "." + FilenameUtils.getExtension(orgFileName);//获取拓展名字.jpg
		String fileName = uuid + ext;//xxxxxsfsasa.jpg

		// Endpoint以杭州为例，其它Region请按实际情况填写。
		String endpoint = "http://oss-cn-shenzhen.aliyuncs.com";
		// 云账号AccessKey有所有API访问权限，建议遵循阿里云安全最佳实践，创建并使用RAM子账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建。
		String accessKeyId = "LTAIA8YksHcNgE5g";
		String accessKeySecret = "F1V0wpZigzJCfHGgukMwxHMsUZrsB5";
		// 创建OSSClient实例。
		OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
		// 上传文件流。
		ossClient.putObject("tripdemo", fileName, file.getInputStream());
		// 关闭OSSClient。
		ossClient.shutdown();
		return ALI_DOMAIN + fileName;
	}


	
}
























