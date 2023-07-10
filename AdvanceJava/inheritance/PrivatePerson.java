package inheritance;

public class PrivatePerson {
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void displayInfo(){
        System.out.println("From PrivatePerson:= ");
        System.out.println("Name:= "+name);
        System.out.println("Age:= "+age);
    }
}
