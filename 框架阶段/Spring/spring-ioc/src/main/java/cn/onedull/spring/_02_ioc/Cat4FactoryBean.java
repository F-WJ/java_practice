package cn.onedull.spring._02_ioc;

import org.springframework.beans.factory.FactoryBean;

public class Cat4FactoryBean implements FactoryBean<Cat4>{

	@Override
	public Cat4 getObject() throws Exception {
		// TODO Auto-generated method stub
		return new Cat4();
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Cat4.class;
	}

}
