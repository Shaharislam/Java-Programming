package package02;
import package01.Cow; // Import User Define Package System = import-package name- Class name
import package01.*; // Import All class from another package
public class Cat {
    public static void main(String[] args) {
        Cow cw = new Cow(); // Class from Another Package
        Duck dk = new Duck();

        Dog dog = new Dog(); // same package class 
        package01.Dog dog1 = new package01.Dog(); // Same Class name from different package access system.
    }
}
