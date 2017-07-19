package net.donnert.spring.boot.scope_proxy.service;

import net.donnert.spring.boot.scope_proxy.model.Cart;
import net.donnert.spring.boot.scope_proxy.model.Mart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {
	
	@Autowired
	private Cart cart;

	public void addApple() {
		cart.addApple();
	}
}
