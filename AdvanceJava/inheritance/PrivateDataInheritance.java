package inheritance;

public class PrivateDataInheritance {

    public static void main(String[] args) {
        PrivateTeacher pt =new PrivateTeacher();
        pt.setName("Rakib");
        pt.setAge(30);
        pt.setClassName("CSE");
        pt.displayInfo();

        PrivateTeacher pt1 =new PrivateTeacher();
        pt.setName("Rakib2");
        pt.setAge(40);
        pt.displayInfo();

        PrivatePerson pp = new PrivatePerson();
        System.out.println();
        pp.setAge(32);
        pp.setName("PP");
        pp.displayInfo();

    }



}
