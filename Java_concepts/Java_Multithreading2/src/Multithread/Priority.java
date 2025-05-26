package Multithread;

public class Priority extends Thread {
	
	public Priority(String name ) {
		super(name);
	}
	
	
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			
			String a="";
			for(int j=0;j<100000;j++) {
				a+="1";
			}
			System.out.println(Thread.currentThread().getName() + "-Priority :"+Thread.currentThread().getPriority() + "-count : "+i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Priority p1 = new Priority("Maxiii");
		Priority p2 = new Priority("Medium");
		Priority p3 = new Priority("Low");
		
		p1.setPriority(Thread.MAX_PRIORITY);
		p2.setPriority(Thread.MIN_PRIORITY);
		p3.setPriority(Thread.NORM_PRIORITY);
		
		p1.start();
		p2.start();
		p3.start();

	}

}
