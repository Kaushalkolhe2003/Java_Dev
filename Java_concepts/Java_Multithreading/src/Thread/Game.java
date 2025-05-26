package Thread;

// Creating a class that implements the Runnable interface
public class Game implements Runnable {
    
    // Overriding the run() method from Runnable interface
    // This method contains the code that will run in the thread
    public void run() {
        // Loop that prints "hiii" 10,000 times
        for (int i = 0; i < 10000; i++) {
            System.out.println("hiii");
        }
    }
}
