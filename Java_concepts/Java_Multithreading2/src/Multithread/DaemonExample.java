package Multithread;

public class DaemonExample extends Thread {
	
	public void run() {
		while(true) {
			System.out.println("helllo ladyy");
		}
	}

	public static void main(String[] args) {
		DaemonExample t1= new DaemonExample();
		
		t1.setDaemon(true);
		t1.start();
		System.out.println("end of main");

	}

}

/*A daemon thread in Java is a background thread that supports user threads. The key difference is that the JVM doesn’t wait for daemon threads to finish when shutting down.
We mark a thread as a daemon using setDaemon(true) before starting it. For example, the garbage collector is a daemon thread — it keeps running in the background while the main program runs.
But once all user threads finish, the JVM will automatically kill all daemon threads and shut down, even if they’re still running.**
So daemon threads are used for tasks like monitoring, logging, or cleanup — they’re important, but not critical to keep the app alive."**
 * 
 * 
 */
