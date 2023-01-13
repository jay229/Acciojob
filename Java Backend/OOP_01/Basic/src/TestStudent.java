class MyStudent{
    int id;
    String name;
    MyStudent(int id,String name){
        System.out.println("Constructor call...");
        this.id=id;
        this.name=name;
    }
//    Initialization through method
    public void insertRecord(int id,String name){
        this.id=id;
        this.name=name;
    }
}
public class TestStudent {
    public static void main(String[] args) {
        MyStudent s1=new MyStudent(3,"Jay");
//        printing default values
        System.out.println(s1.id);
        System.out.println(s1.name);

//        Object initialization through reference
        s1.id=01;
        s1.name="jay";
        System.out.println(s1.id);
        System.out.println(s1.name);

        s1.insertRecord(02,"Mritunjay");
        System.out.println(s1.id);
        System.out.println(s1.name);


    }
}
