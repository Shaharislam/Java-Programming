package instanceOfPackage;



public class TestObject {


    public static void main(String[] args) {
        Animal a = new Animal();
        Person p =new Person();
        Teacher t =new Teacher();

        System.out.println(a instanceof Animal);// Animal Object , Answer Should be: = true
        System.out.println(p instanceof Animal);// Person class extends Animal , Answer Should be: = true
        System.out.println(t instanceof Animal);// Teacher extends Person and Person extends Animal, Answer Should be: = true
        System.out.println(t instanceof Person);// Teacher class extends Person class, Answer Should be: = true
        System.out.println(p instanceof Teacher);// Person class doesn't extend Teacher Class, Answer Should be: = false
    }
}
