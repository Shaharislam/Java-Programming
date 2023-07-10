package thisKeyWord;

public class Person {
    String name , color;
    int age;

    Person(String name , String color){
        this.name = name;
        this.color = color;
    }

    Person(String  name , String color, int age){
        this(name,color); // this use to call Constructor from same class and use it in first line
        this.age =age;
    }

    void displayInfo(){
        System.out.println("name:= "+name);
        System.out.println("Age:= "+age);
        System.out.println("Color:- "+color);
    }
}
