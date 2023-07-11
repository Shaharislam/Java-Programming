package polymorphismPackage;

public class Student extends Teacher{

    @Override
    void display() {
        System.out.println("From Student Sub-Class Extends Teacher Class");
    }
}
