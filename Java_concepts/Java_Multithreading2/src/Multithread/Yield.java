package Multithread;

public class Yield extends Thread {
	
	public Yield(String name) {
		super(name);
	}
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("hello "+Thread.currentThread().getName());
			Thread.yield();
		}
	}

	public static void main(String[] args) {
		Yield t1= new Yield("Django");
		Yield t2 = new Yield("Spring");
		t1.start();
		t2.start();

	}

}



/*
 *  What is yield()?
yield() is a static method of the Thread class. It tells the currently executing thread:

"I’m willing to pause and give other threads of the same priority a chance to run."
 */
