package com.duteliang.provider1.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.duteliang.api.Consumer1Service;
import com.duteliang.api.Provider1Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author: zl
 * @Date: 2018-12-4 09:38
 */
@Slf4j
@Component
@Service(filter = {"tracing"})
public class Provider1ServiceImpl implements Provider1Service {

	@Reference(check = false,filter = {"tracing"})
	private Consumer1Service consumer1Service;

	@Override
	public String get(String name) {
		log.info("我是provider1,name="+name);
		consumer1Service.hello();
		return "我是provider1,name="+name;
	}

	@Override
	public String hello() {
		log.info("hello！！");
		return null;
	}


}
