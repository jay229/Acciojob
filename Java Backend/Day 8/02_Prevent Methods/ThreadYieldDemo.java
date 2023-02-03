class Demo extends Thread{
   @Override
    public void run(){
        Thread.currentThread().setPriority(4);
        for(int i=0;i<5;i++){
            // System.out.println("Child thread");
            Thread.yield();
            System.out.println("Thread :"+Thread.currentThread().getName()+" Priority :"+Thread.currentThread().getPriority());
        }
    }
}

public class ThreadYieldDemo {
    public static void main(String[] args) {
        Demo d1=new Demo();
        d1.start();
        for (int i = 0; i < 5; i++) {
            //System.out.println("Main thread");
            System.out.println("Thread :"+Thread.currentThread().getName()+" Priority :"+Thread.currentThread().getPriority());
        }
    }

}
