package Multithreading;

public class StringThread {

	public static void main(String[] args) {
		main thread1 = new main("Hello", 2000);
		main thread2 = new main("I'm", 4000);
		main thread3 = new main("Everyone", 3000);
		main thread4 = new main("Java", 5000);
		main thread5 = new main("Thread", 6000);

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		try {
			thread1.join();
			thread2.join();
			thread3.join();
			thread4.join();
			thread5.join();
		}

		catch (Exception e) {

		}

	}

}
