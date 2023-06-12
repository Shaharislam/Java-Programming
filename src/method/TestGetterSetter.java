package method;

public class TestGetterSetter {

    public static void main(String args[]){
        GetterSetter obj = new GetterSetter();

        obj.setName("Rakibul Shahar");
        System.out.println(obj.getName());

        obj.setAge(20);
        System.out.println("Age:= "+obj.getAge());
    }

}
