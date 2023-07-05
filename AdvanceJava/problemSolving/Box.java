package problemSolving;

public class Box {
    double height,width,depth;

    Box(double h, double w ,double d){
        this.height=h;
        this.width =w;
        this.depth=d;
    }

    void displayVol(){
        double vol = height*width*depth;
        System.out.println("Box Volume: = "+vol);
    }
}
