package net.donnert.spring.boot.scope_proxy.controller;

import net.donnert.spring.boot.scope_proxy.model.Cart;
import net.donnert.spring.boot.scope_proxy.model.Mart;
import net.donnert.spring.boot.scope_proxy.service.CartService;
import net.donnert.spring.boot.scope_proxy.service.MartService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mart")
public class MartController {
	
	@Autowired
	private CartService cartService;
	
	@Autowired
	private MartService martService;
	
	@Autowired
	private Cart cart;

	@Autowired
	private Mart mart;

	@RequestMapping("")
	private String mail() {

		cartService.addApple();

		martService.cartAdded();

		return String.format("%s, %s", cart.toString(), mart.toString());
	}

}