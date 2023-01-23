/**
 * Example of threading
 */
// To create a thread Thread class is extended by class Simple
public class Simple extends Thread {
    @Override
    public void run() {
        for(int i=1;i<=5;i++){
            System.out.println("This is from run method");
        }
    }

    public static void main(String[] args) {
        System.out.println("This is the first thread");
        Simple obj=new Simple();
        // obj.testThread();

        /*
         * it starts a new thread and register with thread scheduler
         * It add that thread to ThreadGroup
         * It performs other low level activity
         * It calls to run method
         */
        // obj.start();
        // Executed by main thread
        obj.run();
        for (int i = 0; i < 5; i++) {
            System.out.println("This is from main method");
        }
        
       
        

    }
}