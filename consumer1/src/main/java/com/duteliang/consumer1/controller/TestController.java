package com.duteliang.consumer1.controller;

import com.duteliang.api.Consumer1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zl
 * @Date: 2018-12-4 09:40
 */

@RestController
public class TestController {

	@Autowired
	private Consumer1Service consumer1Service;

	@RequestMapping(value = "test",method = RequestMethod.GET)
	public String test(String name){
		return consumer1Service.getString(name);
	}



}
