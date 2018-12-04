package com.duteliang.consumer1.filter;

import com.alibaba.dubbo.rpc.*;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: zl
 * @Date: 2018-12-4 16:11
 */
@Slf4j
public class MyFilter implements Filter {
	@Override
	public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {

		log.info("hahahahahhahahahahhaa");
		return invoker.invoke(invocation);
	}
}
