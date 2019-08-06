package com.spring.test;

import com.spring.config.AppConfig;
import com.spring.service.CityService;
import com.spring.service.OrderService;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		//加载 spring环境
		//		AnnotationConfigApplicationContext 初始化spring的环境类
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		//包扫描的时候会创建一个BeanDefinition对象 存储bean的各种信息 (类名)
//		BeanDefinition beanDefinition = new GenericBeanDefinition();
//		beanDefinition.setBeanClassName("cityService");
//		((GenericBeanDefinition) beanDefinition).setBeanClass(CityService.class);
//		CityService cityService1 = context.getBean(CityService.class);
//		CityService cityService2 = context.getBean(CityService.class);
//		System.out.println(cityService1==cityService2);
		System.out.println(context.getBean(OrderService.class));
	}
}
