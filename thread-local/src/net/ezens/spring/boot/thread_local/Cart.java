package net.ezens.spring.boot.thread_local;

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
