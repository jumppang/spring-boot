package net.donnert.spring.boot.thread_local;

public class ThreadRepository {
	private static ThreadLocal<Cart> threadLocal = new ThreadLocal<Cart>() {
		@Override
		protected Cart initialValue() {
			return new Cart();
		};
	};
	
	public static Cart getCart() {
		return threadLocal.get();
	}
	
	public static void remove() {
		threadLocal.remove();
	}
}
