package allTypeOfVariables;

public class StaticBlocks {
     //Static method Can't use nonStatic member
    static String name;
    static int id;

    static {
           id = 201212010;
           name = "Rakibul";
        System.out.println("Static Block Execute First");
    }

    static void display(){
        System.out.println("This is Static Method");
        System.out.println("Name: "+ name +" ID:= "+ id);
    }

    void displayNonStatic(){
        System.out.println("Non Static Method Can Used Static Variable");
        System.out.println("Name: "+ name +" ID:= "+ id);
    }

    public static void main(String[] args) {
        StaticBlocks obj =new StaticBlocks();
        StaticBlocks.display();
        obj.displayNonStatic();
    }
}
