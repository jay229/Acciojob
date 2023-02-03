class ThreadTest extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
           try {
            Thread.sleep(1000);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
            System.out.println("Child thread");
        }
    }
}
public class ThreadSleepDemp {
    public static void main(String[] args) throws InterruptedException {
        ThreadTest t1=new ThreadTest();
        t1.start();
        // try {
        //     t1.sleep(1000);
        // } catch (Exception e) {
        //     // TODO: handle exception
        //     e.printStackTrace();
        // }
       
        for (int i = 0; i < 5; i++) {
            // Thread.sleep(1000);
            System.out.println("Main thread");
        }
    }
}
