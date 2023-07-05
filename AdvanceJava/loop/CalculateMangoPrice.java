package loop;
import java.util.*;

public class CalculateMangoPrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int box = 380;
        double service = 14.5;
        int quantityOfMango = 40;


        System.out.println("Input Total Price:= ");
        int totalPrice =scanner.nextInt() ;

        double mangoPerKg= ((totalPrice-box)-(service*quantityOfMango))/40;
        double mangoPerMon = mangoPerKg*40;

        System.out.println("Per/Kg:= "+mangoPerKg+" Tk" +"  Price/Mon:= "+mangoPerMon);


    }
}
