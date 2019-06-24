package _01_upload;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;

@WebServlet("/register")
public class UploadServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//判断是否是文件上传请求
		boolean isMultipart = ServletFileUpload.isMultipartContent(req);
		if(isMultipart){
			//创建FileItem工厂
			DiskFileItemFactory factory = new DiskFileItemFactory();
			//创建爱你文件上传的处理
			ServletFileUpload upload = new ServletFileUpload(factory);
			//解析请求过来的数据
			try {
				List<FileItem> items = upload.parseRequest(req);
				//遍历表单所有数据
				for (FileItem fileItem : items) {
					//判断是否是普通表单
					if(fileItem.isFormField()){
						String fieldName = fileItem.getFieldName();
						System.out.println(fieldName);
						String value = fileItem.getString("utf-8");
						System.out.println(value);
					}else{
						//获取文件名
						String name = fileItem.getName();
						//UUID（保证文件唯一性）
						String fileName = UUID.randomUUID().toString() + "." + FilenameUtils.getExtension(name);
						System.out.println(fileName);
						//保存文件
						File file = new File(req.getServletContext().getRealPath("/upload"), fileName);
						fileItem.write(file);
						
						//获取文件类型
						String contentType = fileItem.getContentType();
						System.out.println(contentType);
					}
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
;	}
}
