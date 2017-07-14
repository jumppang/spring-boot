package net.donnert.spring.boot.thread_local;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
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
        ThreadRepository.remove();
        
        this.addMelon();
        
        this.cartService.addOrange();
        
        this.appleService.addToCart();
        
        return ThreadRepository.getCart().toString();
    }
    
    private void addMelon() {
        ThreadRepository.getCart().addMelon();
    }
}
