// To create a thread Runnable interface is implemented by class MyThread
public class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("run method");
        }
    }
    public static void main(String[] args) {
        // main thread is running
        MyThread obj=new MyThread();
        // Creating the new thread
        Thread new_thread=new Thread(obj);
        // starting the thread
        new_thread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("main thread");
        }

    }
}
