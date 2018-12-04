package com.duteliang.consumer1;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: zl
 * @Date: 2018-12-4 09:28
 */
@SpringBootApplication(scanBasePackages	 = {"com.duteliang"})
@EnableDubboConfiguration
public class Consumer1Application {


	public static void main(String[] args) {

		SpringApplication.run(Consumer1Application.class, args);

	}

}
