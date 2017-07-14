package net.donnert.spring.boot.thread_local;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class Cart {
	private int apple = 0;
	private int orange = 0;
	private int melon = 0;
	
	public void addApple() {
		this.apple++;
	}

	public void addOrange() {
		this.orange++;
	}

	public void addMelon() {
		this.melon++;
	}

	@Override
	public String toString() {
		return "Cart [apple=" + apple + ", orange=" + orange + ", melon="
				+ melon + "]";
	}
}
