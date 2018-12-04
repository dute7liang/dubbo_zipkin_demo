package com.duteliang.provider1;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: zl
 * @Date: 2018-12-3 17:54
 */
@SpringBootApplication
@EnableDubboConfiguration
public class Provider1Application {

	public static void main(String[] args) {

		SpringApplication.run(Provider1Application.class, args);

	}

}
