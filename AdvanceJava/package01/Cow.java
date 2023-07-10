package package01;
import package02.Cat; // Import User Define Package System = import-package name- Class name
import package02.*; // Import All class from another package

public class Cow {
    public static void main(String[] args) {
        Cat ct = new Cat(); // Class from Another Package
        Hen hn = new Hen(); // Class from Another Package
    }
}
