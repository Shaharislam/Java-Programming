package methods;

public class OverRiddingClass extends Teacher {
    String newVariable;
    public static void main(String[] args) {
       Teacher tr =new Teacher("Rakib","Male",25);
       tr.displayInformation();
       OverRiddingClass ov = new OverRiddingClass();
       ov.displayInformation();
    }
    //@Override
    void  displayInformation(){
        System.out.println("Name:= "+OverrideName);
        System.out.println("Age:= "+OverrideAge);
        System.out.println("New Variable:= "+newVariable);
    }
}
