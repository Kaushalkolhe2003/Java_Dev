package Thread;

public class Test {

	public static void main(String[] args) {
		Word w = new Word(); 
		w.start(); //runnable state 
		for(int i=0;i<5000;i++) {
			System.out.println(Thread.currentThread().getName());
			
		}
		Game g= new Game();
		Thread t1= new Thread(g);
		t1.start();
		
		
		System.out.println(Thread.currentThread().getName()); // running main thread
	}

}
