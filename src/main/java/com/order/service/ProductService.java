package com.order.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("product")
public interface ProductService {

	@PostMapping("/product/getProduct")
	String getProduct(@RequestParam("productName") String productName);
}
