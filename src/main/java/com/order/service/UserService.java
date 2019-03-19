package com.order.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

// 如果user服务在注册中心是这样的,izm5e1quxhnlkaldhhgoihz:user:8771 , izm5e1quxhnlkaldhhgoihz:user:8772
// 获取到的host为izm5e1quxhnlkaldhhgoihz,在当前消费者的机器上必须能识别izm5e1quxhnlkaldhhgoihz,配置hosts文件即可
// 如47.105.*.* izm5e1quxhnlkaldhhgoihz

// feign自动使用ribbon的客户端负载均衡,轮询,
// feign自动添加了hystrix依赖,需要开启配置feign.hystrix.enabled=true,可以在服务不可用时熔断,降级fallbackFactory或fallback,指定失败要执行的类,
@FeignClient(name = "user", fallbackFactory = UserServiceFallbackFactory.class)
public interface UserService {
	@RequestMapping(method = RequestMethod.POST, value = "/user/getUser")
	String getUser(@RequestParam("name") String name);
}
