package methods;

public class Teacher {

    String name,gender;
    int phone;

    String OverrideName;
    int OverrideAge;


    Teacher(){
        System.out.println("No Information");

    }
    Teacher(String name, String  gender, int OverrideAge){
        this.name=name;
        this.gender=gender;
        this.OverrideName =name;
        this.OverrideAge = OverrideAge;
    }
    Teacher( String name, String gender){
        this.name=name;
        this.gender=gender;
      //  this.phone=phone;
    }

    void display(){
        System.out.println("Name:= "+name);
        System.out.println("Gender:= "+gender);
        System.out.println("Phone:= "+phone);
    }

    void  displayInformation(){
        System.out.println("Name:= "+OverrideName);
        System.out.println("Age:= "+OverrideAge);
    }
}
