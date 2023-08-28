package com.maaz;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.maaz.services.OrderBussinessService;
import com.maaz.services.OrderBussinessService2;
import com.maaz.services.OrderBussinessServiceInterface;

@Configuration
public class SpringConfig {
	@Bean(name="OrderBussinessService")
	public OrderBussinessServiceInterface getOrdersBussiness() {
		return new OrderBussinessService();
	}
}
