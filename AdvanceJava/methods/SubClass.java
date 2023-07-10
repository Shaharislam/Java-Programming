package methods;

public class SubClass extends SuperClass{
    int x =5;

    SubClass(){
       // super();// Super Class constructor call
        super(19); // Super Class constructor call with a parameter Note: Only One super Constructor We can Call
        System.out.println("I am SubClass Constructor");
        System.out.println();
    }
    void displayInfo(){
        System.out.println("From SubClass X:= "+x);
        System.out.println("From Super Class X:= "+super.x); // Use of super KeyWord
    }

    void displayInformation(){
        super.displayInformation();
        System.out.println("I am from Sub Class and Call Super Class Overridden method");
        message();
    }

}
