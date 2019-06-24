package cn.onedull._04_administrator.web.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import cn.onedull._04_administrator.dao.IUserDAO;
import cn.onedull._04_administrator.dao.impl.UserDAOImpl;
import cn.onedull._04_administrator.domain.User;

@WebListener
public class MyServletContextListener implements ServletContextListener {
	IUserDAO dao = new UserDAOImpl();
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		//获取值
		User u = dao.checkUserName("root");
		//判断是否存在
		if(u == null){
			User user = new User("root", "123456");
			//保存值
			dao.save(user);
		}

	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub

	}

}
