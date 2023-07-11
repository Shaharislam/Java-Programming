package polymorphismPackage;

public class Test {
    public static void main(String[] args) {
        Person p =new Person();
        Teacher t = new Teacher();
        Student s = new Student();

        p.display();
        t.display();
        s.display();

        //Run time polymorphism
        // Super class object refer to SubClass Object
        // Sub-Class Object doesn't refer to Super class Object
        Person person = new Teacher();  // Super class Object refer to Sub-Class Object
        System.out.println("\nSuper Class Person Refer to Teacher Sub-Class Object: ");
        person.display();

        Person pp = new Student();// Super class Object refer to Sub-Class Object
        System.out.println("\nSuper Class Person Refer to Student Sub-Class Object:");
        pp.display();

        Teacher ts = new Student();// Super class Object refer to Sub-Class Object
        System.out.println("\nSuper Class Teacher Refer to Student Sub-Class Object:");
        ts.display();


    }
}
