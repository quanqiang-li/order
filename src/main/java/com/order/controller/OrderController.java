package com.order.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.service.ProductService;
import com.order.service.UserService;

@RestController
@RequestMapping("order")
public class OrderController {
	@Value("${server.port}")
	private Integer port;
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private UserService userService;
	@Autowired
	private ProductService productService;
	
	@GetMapping("getOrder")
	public String getOrder(String OrderName) {
		logger.info("请求端口{}的订单{}", port, OrderName);
		String user = userService.getUser(OrderName);
		logger.info("获取用户信息{}", user);
		String product = productService.getProduct(OrderName);
		logger.info("获取产品信息{}", product);
		return "请求端口" + port + "的订单" + OrderName + ";获取用户信息:" + user +";获取产品信息:" + product;
	}
}
