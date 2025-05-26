package Thread1;

// Custom thread class extending Thread
public class Mythread extends Thread {
	
    // This method is executed when the thread starts
	@Override
	public void run() {
		System.out.println("Running......");
		
		try {
			// Thread goes to TIMED_WAITING state for 7 seconds
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// Handles interruption during sleep
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// Creating a new thread object — thread is in NEW state
		Mythread t1 = new Mythread();

		// Print state before starting — should be NEW
		System.out.println(t1.getState());  // Output: NEW

		// Start the thread — run() will be called in a new thread
		t1.start();

		// Print state just after starting — likely RUNNABLE
		System.out.println(t1.getState());  // Output: RUNNABLE (can be RUNNING depending on CPU)

		// Main thread sleeps for 5 seconds — gives t1 time to enter sleep
		Thread.sleep(600);

		// Print the state of the current thread (main thread)
		// Will print RUNNABLE if it is actively executing after sleep
		System.out.println(Thread.currentThread().getState());  // Output: RUNNABLE

		// Print the state of t1 thread — likely TIMED_WAITING (still sleeping)
		System.out.println(t1.getState());  // Output: TIMED_WAITING

		// Main thread waits for t1 to finish using join()
		t1.join();  // If t1 hasn't finished yet, main thread enters WAITING state

		// Once t1 finishes execution, its state becomes TERMINATED
		System.out.println(t1.getState());  // Output: TERMINATED
	}
}
