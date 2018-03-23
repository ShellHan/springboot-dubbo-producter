package com.springboot.producter.service;

import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Override
	public String sayHello() {
		return "hello dubbo!";
	}

}
