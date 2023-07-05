package allTypeOfVariables;

public class InstanceVariable {

    int count = 0;

    InstanceVariable(){
        count++;
    }

    void instanceVariable(){
        System.out.println("Non-Static Instance Variable Object:= "+count);
    }
}
