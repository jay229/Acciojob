//abstract class
abstract class AbsDemo{
//    abstract method
    abstract void display();
}
public class MyClass extends AbsDemo {
     void display(){
         System.out.println("Abstract method");
    }

    public static void main(String[] args) {
        AbsDemo obj=new MyClass();
        obj.display();


    }
}
