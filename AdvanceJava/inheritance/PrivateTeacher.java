package inheritance;

public class PrivateTeacher extends PrivatePerson {
    private String className;

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void displayInfo(){
        System.out.println();
        System.out.println("From Private Teacher:= ");
        System.out.println("Name:= "+getName());
        System.out.println("Age:= "+getAge());
        System.out.println("Class:= "+className);

    }
}
