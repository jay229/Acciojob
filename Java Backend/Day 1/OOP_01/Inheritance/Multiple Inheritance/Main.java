class Animal{
    public void eat() {
        System.out.println("eating...");
    }
}
interface  Dog{
    public void bark();
     
}
class babyDog extends Animal implements Dog{
    public void bark(){
        System.out.println("Barking...");
    }
}
public class Main {
 public static void main(String[] args) {
    babyDog bg=new babyDog();
    bg.bark();
    bg.eat();
 }   
}
