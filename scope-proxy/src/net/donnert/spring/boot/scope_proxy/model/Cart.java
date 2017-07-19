package net.donnert.spring.boot.scope_proxy.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Cart {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	private int apple;
	private int melon;
	
	public void addApple() {
		this.apple++;
	}

	public void addMelon() {
		this.melon++;
	}
	
	public void init() {
		logger.info("initialize[{}]", this.getClass().getSimpleName());
	}

	public void destroy() {
		logger.info("destroy[{}]", this.getClass().getSimpleName());
	}

	@Override
	public String toString() {
		return "Cart [apple=" + apple + ", melon=" + melon + "]";
	}
}
