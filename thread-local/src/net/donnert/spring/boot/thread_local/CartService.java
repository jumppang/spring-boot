package net.donnert.spring.boot.thread_local;

import org.springframework.stereotype.Service;

@Service
public class CartService {
	public void addOrange() {
		ThreadRepository.getCart().addOrange();
	}
}
