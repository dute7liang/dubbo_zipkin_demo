package com.duteliang.consumer1.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.duteliang.api.Consumer1Service;
import com.duteliang.api.Provider1Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author: zl
 * @Date: 2018-12-4 09:31
 */
@Slf4j
@Service(filter = {"tracing"})
@Component
public class Consumer1ServiceImpl implements Consumer1Service {

	@Reference(interfaceClass = Provider1Service.class,check = false,filter = {"tracing"})
	private Provider1Service provider1Service;

	@Override
	public String getString(String name) {
		log.info("我是consumer1"+name);
		provider1Service.hello();
		String s = provider1Service.get(name);
		return "我是consumer1"+name;
	}

	@Override
	public String hello() {
		log.info("我是hello");
		return null;
	}
}
