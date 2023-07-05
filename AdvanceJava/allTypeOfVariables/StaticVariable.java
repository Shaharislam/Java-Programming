package allTypeOfVariables;

public class StaticVariable {
    static int count =0;

    StaticVariable(){
        count++;
    }

    void totalStaticObject(){
        System.out.println("Total Static Object:= "+count);
    }

    static  void totalStaticObjectInStaticMethod(){
        System.out.println("Static variable from Static Method: "+count++);
    }
}
