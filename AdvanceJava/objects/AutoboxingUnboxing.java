package objects;

public class AutoboxingUnboxing {
    public static void main(String[] args) {
        //Primitive to Object

        int x =30;
        Integer y = Integer.valueOf(x);
        System.out.println("X= "+y);

        Integer z = x; // this is Autoboxing Integer.valueOf(x) automatic assign

        // Object to Primitive

        Double d = Double.valueOf(10.5);
        System.out.println("D= "+d);

        double dd= d; // Unboxing
        System.out.println("DD= "+dd);
    }
}
