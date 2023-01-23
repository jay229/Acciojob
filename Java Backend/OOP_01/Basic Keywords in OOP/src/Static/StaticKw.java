class Demo{
    public int id;
    public String name;
//  Static variable
    public static String college="SVCET, Chittoor";

    Demo(int id,String name, String college){
        this.id=id;
        this.name=name;
        this.college=college;
    }
    public  void display(){
        System.out.println("Student id :"+id);
        System.out.println("Student Name :"+name);
        System.out.println("Student College :"+college);
    }
}
public class StaticKw {
    public static void main(String[] args) {
        Demo s1=new Demo(1,"Mritunjay","SVCET");
        Demo s2=new Demo(2,"jay","NIT");
        s1.display();
        s2.display();
    }

}
