class Demo{
//    static variable
    static String str;
//    Instance method which always accessed through object
    public void access(){
        str="Hello world";
        System.out.println(str);
    }
//    static method
    public static void accessData(){
        str="I'm a static variable";
        System.out.println(str);
    }
}
public class Main {
    public static void main(String[] args) {
       // Demo obj=new Demo();
        //obj.access();
        //obj.accessData();

//        calling a static method without object
        Demo.accessData();
//        It is not possible to call non static method without object
//        Demo.access();
    }
}