public class Dog {
    String name;
    String breed;
    int age;
    String color;

    // constructor
    Dog(String name,String breed,int age,String color){
        this.name=name;
        this.breed=breed;
        this.age=age;
        this.color=color;
    }
    public String getName(){
        return this.name;
    }
    public String getBreed(){
        return this.breed;
    }
    public int getAge(){
        return this.age;
    }
    public String getColor(){
        return this.color;
    }
    public String toString(){
        return ("Hii my name is "+this.getName()+". I am of "+this.getBreed()+" brred. My age is "+this.getAge()+". My color is "+this.getColor()+".");
    }
    public static void main(String[] args) {
        Dog d=new Dog("tuffy", "papillon", 6, "Black");
        //depricated newInstance()(since java 9)
        //Dog d1=(Dog)Class.forName("Dog").newInstance();
        
    }

}
