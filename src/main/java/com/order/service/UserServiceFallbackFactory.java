package com.order.service;

import org.springframework.stereotype.Component;

import feign.hystrix.FallbackFactory;

@Component
public class UserServiceFallbackFactory implements FallbackFactory<UserService> {

	@Override
	public UserService create(Throwable cause) {
		return new UserService() {

			@Override
			public String getUser(String name) {
				// TODO Auto-generated method stub
				return "UserService.getUser 失败,原因是: " + cause.getMessage();
			}
		};
	}

}
