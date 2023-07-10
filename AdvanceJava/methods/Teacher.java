package methods;

public class Teacher {

    String name,gender;
    int phone;

    Teacher(){
        System.out.println("No Information");

    }
    Teacher(String name, String  gender){
        this.name=name;
        this.gender=gender;
    }
    Teacher( String name, String gender , int phone){
        this.name=name;
        this.gender=gender;
        this.phone=phone;
    }

    void display(){
        System.out.println("Name:= "+name);
        System.out.println("Gender:= "+gender);
        System.out.println("Phone:= "+phone);


    }
}
