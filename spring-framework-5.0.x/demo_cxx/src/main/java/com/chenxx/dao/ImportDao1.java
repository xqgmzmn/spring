package com.chenxx.dao;

import com.chenxx.imports.MyInvocationHandler;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;
import org.springframework.context.annotation.Import;

public class ImportDao1 implements BeanPostProcessor {

	public void  query(){
		System.out.println("ImportDao1");
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(beanName.equals("importDao1")){

//			bean = Proxy.newProxyInstance(this.getClass().getClassLoader()),new Class[{ImportDao.class}], new MyInvocationHandler(bean));


			bean = Proxy.newProxyInstance(this.getClass().getClassLoader(),new Class[]{ImportDao.class}, (InvocationHandler) new MyInvocationHandler(bean));
		}

		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return null;
	}
}
