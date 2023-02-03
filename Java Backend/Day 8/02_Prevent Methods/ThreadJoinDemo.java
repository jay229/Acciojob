class Test extends Thread{
    public void run() {
        try {
            Thread.currentThread().join();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Child thread");
        }
    }
}

public class ThreadJoinDemo {   
    public static void main(String[] args)  {
        Test t1=new Test();
        t1.start();
        try {
            Thread.currentThread().join();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        for(int i=0;i<5;i++){
            System.out.println("Main thread");
        }
    }
    
}
