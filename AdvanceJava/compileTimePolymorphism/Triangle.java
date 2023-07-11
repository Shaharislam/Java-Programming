package compileTimePolymorphism;

public class Triangle extends Shape{
    //area method
    double base , height;

    Triangle(double base , double height){
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        System.out.print("Sub Class:=   ");
        return .5*base*height;
    }
}
