package net.donnert.spring.boot.scope_proxy.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mart {
	Logger logger = LoggerFactory.getLogger(this.getClass());

	private int cartCount;

	public void cartAdded() {
		cartCount++;
	}

	public void init() {
		logger.info("initialize[{}]", this.getClass().getSimpleName());
	}

	public void destroy() {
		logger.info("destroy[{}]", this.getClass().getSimpleName());
	}

	@Override
	public String toString() {
		return "Mart [cartCount=" + cartCount + "]";
	}
}
