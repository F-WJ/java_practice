package cn.onedull._03_listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;


@WebListener
public class MyHttpSessionAttributeListener implements HttpSessionAttributeListener {

	@Override
	public void attributeAdded(HttpSessionBindingEvent se) {
		//获取值
		String name = se.getName();
		System.out.println("添加：" + name);
		
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent se) {
		String name = se.getName();
		System.out.println("删除：" + name);
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent se) {
		String name = se.getName();
		System.out.println("修改：" + name);
	}

	

}
