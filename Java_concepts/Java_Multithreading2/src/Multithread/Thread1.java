package Multithread;

public class Thread1 extends Thread {
	

	@Override
	public void run() {
		System.out.println("thread is running ......");
		
		
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

	public static void main(String[] args) throws InterruptedException {
		Thread1 t1= new Thread1();
		t1.start();
		t1.join();
		System.out.println("heeee");
		
		

}
}
