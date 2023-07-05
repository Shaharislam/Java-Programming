package allTypeOfVariables;

public class InstanceVariable {

    int count = 0;
    static int count2=0;

    InstanceVariable(){
        count++;
        count2++;
    }

    void instanceVariable(){
        count2++;
        System.out.println("Non-Static Instance Variable Object:= "+count);
        System.out.println("Testing Static Instance Variable increment value:= "+this.count2);
    }
}
