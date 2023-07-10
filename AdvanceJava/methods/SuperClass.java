package methods;

public class SuperClass {
    int x =10;

    SuperClass(){
        System.out.println(" I am Super Class Constructor without Parameter");
    }

    SuperClass(int age){
        System.out.println(" I am Super Class Constructor with Age Parameter:= "+age);
    }
    void displayInformation(){
        System.out.println("I am From Super Class.");
    }

    void message(){
        System.out.println("I am From Super class message function");
    }
}
