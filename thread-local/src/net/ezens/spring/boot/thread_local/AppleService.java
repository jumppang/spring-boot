package net.ezens.spring.boot.thread_local;

import org.springframework.stereotype.Service;

@Service
public class AppleService {
	public void addToCart() {
		ThreadRepository.getCart().addApple();
	}
}
