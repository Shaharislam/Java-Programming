package compileTimePolymorphism;

public class Rectangle extends Shape{
    //area method
    double length,width;

    Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        System.out.print("Sub Class:=   ");
        return length*width;
    }
}
