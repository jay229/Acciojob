// This is all about predefined methods of Thread class and their example
class ThreadFun extends Thread{

    @Override
    public void run() {

        // getting and setting name of the thread
        // this.setName("New thread");
        for (int i = 0; i < 5; i++) {
            try {
                //Thread.sleep(1000);
            } catch (Exception e) {
               
                e.printStackTrace();
            }
           //this.stop(); depricated
           this.interrupt();
            System.out.println(currentThread().getName());
        }
        // System.out.println(Thread.currentThread().getName());

        
    }
}
public class MyThreadDemo {
    public static void main(String[] args)  {
        ThreadFun obj=new ThreadFun(); 

        // getting and setting the priority of thread (1,10, default 5)
        //System.out.println(obj.getPriority());       
       // obj.setPriority(4);
        obj.start();
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
               
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" thread");
        }
        //System.out.println(Thread.currentThread().getPriority());
    }
}
