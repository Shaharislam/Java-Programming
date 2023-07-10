package methods;

public class SubClass extends SuperClass{
    int x =5;

    void displayInfo(){
        System.out.println("From SubClass X:= "+x);
        System.out.println("From Super Class X:= "+super.x); // Use of super KeyWord
    }
}
