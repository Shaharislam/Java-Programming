package methods;

public class TestGetterSetter {
    private double length;
    private double width;

    public TestGetterSetter(){
        length = 0;
        width = 0;
    }

    public TestGetterSetter(double length, double width){
        this.length = length; //can be set this way
        //setLength(length);
        setWidth(width); //or can be set this way
        //this.width = width;
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }

    public double calculateArea(){
        return length * width;
    }
}
