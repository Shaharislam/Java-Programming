package inheritance;

public class Teacher extends Person {
    //Example of Inheritance
     //name , age displayInfo()
    String qualification;


    void displayInfo2() {
        System.out.println("Extends Name:= "+name);
        System.out.println("Extends Age:= "+age);
        System.out.println("Qualification:= "+qualification);
    }
}
