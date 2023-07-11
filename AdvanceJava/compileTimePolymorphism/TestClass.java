package compileTimePolymorphism;

public class TestClass {
    public static void main(String[] args) {
        Shape sp = new Shape();
        Rectangle r = new Rectangle(101,101);
        Triangle t = new Triangle(10,10.5);

        System.out.println("Shape Class: "+sp.area());
        System.out.println("Rectangle Class: "+r.area());
        System.out.println("Triangle Class: "+t.area());

        // Reference Object from Super Class Object
        Shape s1 = new Shape();
        Shape s2 = new Rectangle(101,101);
        Shape s3 = new Triangle(10,10.5);

        System.out.println();
        System.out.println("Shape Class: "+s1.area());
        System.out.println("Super Class Reference Object Rectangle Class: "+s2.area());
        System.out.println("Super Class Reference Object Triangle Class: "+s3.area());

        //Reference Object from Super Class with Array
        Shape[] s = new Shape[3];

        s[0] = new Shape();
        s[1] = new Rectangle(101,101);
        s[2] = new Triangle(10,10.5);

        System.out.println();
        System.out.println("Shape Class with Arrays[0]: "+s[0].area());
        System.out.println("Super Class Reference Object Rectangle Class with Array[1]: "+s[1].area());
        System.out.println("Super Class Reference Object Triangle Class with Array[2]: "+s[2].area());

        System.out.println();
        // Object Call with for loop
        for (int i=0;i<3;i++){
            System.out.println("S["+i+"]:= "+s[i].area());
        }


    }
}
