package methods;

public class OverloadingClass {
    public static void main(String[] args) {
        //Example of Constructor Overloading
        Teacher obj =new Teacher();
        Teacher obj1= new Teacher("Rakib","Male");
        Teacher obj3= new Teacher("Rakib","Male",31300);
        obj1.display();
        obj3.display();

    }
}
