package objects;
import java.util.Scanner;
public class ObjectTesting {

        private Scanner scanner = new Scanner(System.in);

        public static void main(String args[]){

            ObjectTesting calculator = new ObjectTesting();
            TestMethod kitchen = calculator.getRoom();
            TestMethod bathroom = calculator.getRoom();

            System.out.println("Kitchen:= "+kitchen);
            System.out.println("bathroom:= "+bathroom);
            double area = calculator.calculateTotalArea(kitchen, bathroom);

            System.out.println("The total area is: " + area);

            calculator.scanner.close();
        }

        public TestMethod getRoom(){

            System.out.println("Enter the length of your room:");
            double length = scanner.nextDouble();

            System.out.println("Enter the width of your room:");
            double width = scanner.nextDouble();
            System.out.println("Return Value of TestMethod:= "+ new TestMethod(length, width));
            return new TestMethod(length, width);
        }

        public double calculateTotalArea(TestMethod rectangle1, TestMethod rectangle2){
            System.out.println("TestMethod rectangle1:= "+rectangle1);
            System.out.println("TestMethod rectangle2:= "+rectangle2);
            return rectangle1.calculateArea() + rectangle2.calculateArea();
        }
    }


