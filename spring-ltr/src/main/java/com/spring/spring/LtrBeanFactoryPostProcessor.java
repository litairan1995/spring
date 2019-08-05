package com.spring.spring;

import com.spring.service.OrderService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//@Component
public class LtrBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		/**
		 * 存储spring中注解了bean
		 */
		GenericBeanDefinition cityService = (GenericBeanDefinition) beanFactory.getBeanDefinition(
				"cityService");
//		cityService.setScope("prototype");
//		String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
//		System.out.println(Arrays.toString(beanDefinitionNames));
//		String simpleName = cityService.getBeanClass().getSimpleName();
//		System.out.println(simpleName);
		/**
		 * 改变了spring 要实例化的bean对象
		 */
		cityService.setBeanClass(OrderService.class);
		System.out.println("xxx");
	}
}
