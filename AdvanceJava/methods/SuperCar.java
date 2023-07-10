package methods;

public class SuperCar extends SuperVehicle {
    // Auto color , weight and attribute() method from Super class
    int gear;

    SuperCar(String color , double weight , int gear){
        super(color,weight);// Super Constructor Call with Super
        this.gear =gear;
    }

    @Override
    void attribute() {
        super.attribute(); // Super class method call with super
        System.out.println("I am From SubClass: Gear:= "+gear);
        System.out.println();
    }
}
