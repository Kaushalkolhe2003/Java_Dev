package Multithread;

public class Interupt extends Thread {
	

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
			System.out.println("thread is running .....");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Thread is interrupted "+e);
			
		}
	}

	public static void main(String[] args) {
		Interupt t1 = new Interupt();
		Interupt t2 = new Interupt();
		t1.start();
		t2.start();
		t2.interrupt();

	}

}
