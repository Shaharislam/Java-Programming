package methods;

public class SuperVehicle{
    String color;
    double weight;

    SuperVehicle(String color , double weight){
        this.color=color;
        this.weight=weight;
    }

    void attribute(){
        System.out.println();
        System.out.println("I am from Super Color:= "+color);
        System.out.println("Super Weight:= "+weight);
        System.out.println();
    }
}
