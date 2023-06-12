package methods;

public class InheritTestGetterSetter {

    /*
 * Write a class that creates instances of the `TestGetterSetter` class to find the
 * total area of two rooms in a house. */

        public static void main(String args[]){


            //Create instance of `TestGetterSetter` class
            TestGetterSetter room1 = new TestGetterSetter();
            room1.setWidth(25);
            room1.setLength(50);
            double areaOfRoom1 = room1.calculateArea();


            //Create instance of `TestGetterSetter` class
            TestGetterSetter room2 = new TestGetterSetter(30, 75);
            double areaOfRoom2 = room2.calculateArea();

            double totalArea = areaOfRoom1 + areaOfRoom2;

            System.out.println("Area of both rooms: " + totalArea);
        }
    }

