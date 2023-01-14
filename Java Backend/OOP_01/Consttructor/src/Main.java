class Construct{

    String greet;
    //    Default constructor or no arg constructor
    Construct(){
        System.out.println("I'm a default constructor...");
        System.out.println("Object for Construct class is created");
        System.out.println("greet :"+greet);
    }
//    Parameterized constructor
    Construct(String str){
        this.greet=str;
    }
    public  void display(){
        System.out.println(this.greet);
    }
}
public class Main {
    public static void main(String[] args) {
        Construct obj=new Construct("good morning...");
        Construct obj1=new Construct();
       obj.display();
    }
}