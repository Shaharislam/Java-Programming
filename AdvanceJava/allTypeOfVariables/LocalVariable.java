package allTypeOfVariables;

public class LocalVariable {
    static int variable = 10; // this is static variable and Static_Instance variable
    int a =100; // this is Instance variable and NonStatic


    public static void main(String[] args) {

        LocalVariable obj1 = new LocalVariable();
        obj1.localVariable();
    }

    void localVariable(){
        int local = 1000; // This is local Viable

        System.out.println("Local Variable:= "+local);
        System.out.println("Instance / Non Static Instance Variable:= "+a);
        System.out.println("Static Variable:= "+variable);
    }
}
