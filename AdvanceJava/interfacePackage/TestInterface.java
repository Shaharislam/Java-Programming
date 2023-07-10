package interfacePackage;

public class TestInterface {
    public static void main(String[] args) {
        //Interface and Abstract class doesn't create an Object
        Dog dd = new Dog();
        dd.eat();

        Cat ct = new Cat();
        ct.eat();
    }
}
