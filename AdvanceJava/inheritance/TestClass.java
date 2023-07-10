package inheritance;

public class TestClass {
    //Example of Inheritance
    public static void main(String[] args) {
        Teacher t1 =new Teacher();
        t1.name="Rakibul Shahar";
        t1.age = 25;
        t1.qualification = "B.Sc Engineering";
        t1.displayInfo2();

        System.out.println("\n\nSuper Method Call:= ");
        Teacher t2 =new Teacher();
        t2.name="Rakibul";
        t2.age = 30;
        t2.qualification = "B.Sc Engineering";
        t2.displayInfo1();
    }
}
