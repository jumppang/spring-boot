package net.donnert.spring.boot.scope_proxy.config;

import net.donnert.spring.boot.scope_proxy.model.Cart;
import net.donnert.spring.boot.scope_proxy.model.Mart;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Configuration
public class MartConfiguration {
	
	@Bean(initMethod = "init", destroyMethod = "destroy")
	@Scope(value="request", proxyMode=ScopedProxyMode.TARGET_CLASS)
	public Cart cart() {
		return new Cart();
	}

	@Bean(initMethod = "init", destroyMethod = "destroy")
	public Mart mart() {
		return new Mart();
	}
}
