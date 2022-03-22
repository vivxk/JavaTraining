import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class HelloThread extends Thread {
	@Override
	public void run() {
		System.out.println("Hello World!");
		super.run();
	}
}

public class threadd {
	public static void main(String[] args) {
		/*
		 * // List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5)); // //
		 * for(Integer i:list) { // try { // Thread.sleep(10000); // } catch
		 * (InterruptedException e) { // // e.printStackTrace(); // } // //
		 * System.out.println(i); // // }
		 *
		 */
		   HelloThread helloThread = new HelloThread(); //
		  System.out.println(helloThread.getState()); // thread created but not yet running(new state) // 
		  helloThread.start(); // thread now started //
		  System.out.println(helloThread.getState()); // thread in runnable state
		 
	}

}
