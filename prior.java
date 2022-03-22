class priorityThread extends Thread {
	@Override
	public void run() {
		super.run();
		System.out.println(currentThread().getName() + " Priority:" + currentThread().getPriority());
	}
}

public class prior {
	public static void main(String[] args) {

		Thread thread1 = new Thread(new priorityThread());
		Thread thread2 = new Thread(new priorityThread());
		thread1.setName("First Thread");
		thread1.setPriority(10); // Max priority
		thread2.setName("Second Thread");
		thread2.setPriority(1); // Min Priority
		thread1.start();
		thread2.start();

	}

}
