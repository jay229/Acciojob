class Student{
    private int id;
    private String name;
    static String college="SVCET";
    public static void setCollege(){
        college="SVCET,CHITTOOR";

    }
    Student(int id,String name){
        this.id=id;
        this.name=name;

    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}
public class staticMethod {
    public static void main(String[] args) {
        Student s1=new Student(1,"jay");
        System.out.println(s1.getId());
        System.out.println(s1.getName());
        //System.out.println(s1.college);
        Student.setCollege();
        System.out.println(Student.college);


    }
}
