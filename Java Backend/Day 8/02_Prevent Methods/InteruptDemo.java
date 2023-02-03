class TestInterupt extends Thread{
    public void run(){
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("I am lazy...");
                Thread.sleep(1000);
            }
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("I got interupted");
        }
    }
}

public class InteruptDemo {
    public static void main(String[] args) {
        TestInterupt t1=new TestInterupt();
        t1.start();
        t1.interrupt();
        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread");
        }
    }
}
