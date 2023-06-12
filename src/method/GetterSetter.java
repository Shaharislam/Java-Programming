package method;

public class GetterSetter {
    private String name;
    private int age;

    public void setName(String name){
        this.name= name;
    }

    public  String getName(){
        return name;
    }

    public int setAge(int age){
        this.age = age;
        return age;
    }

    public int getAge() {
        return age;
    }
}
