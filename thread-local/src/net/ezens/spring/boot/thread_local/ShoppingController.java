package net.ezens.spring.boot.thread_local;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingController {
	@Autowired
	private CartService cartService;
	
	@Autowired
	private AppleService appleService;

	@RequestMapping("/")
	private String test() {
		ThreadRepository.getCart().addMelon();
		
		cartService.addOrange();

		appleService.addToCart();
		
		return ThreadRepository.getCart().toString();
	}
}
