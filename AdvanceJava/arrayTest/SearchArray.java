package arrayTest;
import java.util.Arrays;
import java.util.Random;
public class SearchArray {
    private static final int LENGTH = 10;
    private static final int MAX_TICKET_NUMBER = 60;

    public static void main(String[] args) {

        int[] ticket = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);

    }

    public static int[] generateNumbers() {

        int[] ticket = new int[LENGTH];
        int searchNumber;

        Random random = new Random();

        for (int i = 0; i < LENGTH; i++) {
            int randomNumber;
            searchNumber = random.nextInt(MAX_TICKET_NUMBER)+1;

            randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;

            ticket[i] = randomNumber;
            boolean number  = search(ticket, searchNumber);
            if(number==true)
            {

                //System.out.println("Ticket: "+ticket[i]+"   Random Number:= "+randomNumber + " Your Search Number isn't found ");
                System.out.println("Ticket: "+ticket[i]+"   Random Number:= "+randomNumber + "  Yes, You Search this Number ");
            }
        }

        return ticket;
    }

    public static boolean search(int[] array, int numberToSearchFor) {

        //System.out.println("NumberToSearchFor = "+numberToSearchFor);
        for (int value : array) {
            //System.out.println("Value:= "+value+ "    NumberToSearchFor = "+numberToSearchFor);
            if (value == numberToSearchFor) {
                return true;
            }
        }
        return false;
    }

//    public static boolean binarySearch(int[] array, int numberToSearchFor) {
//
//        //Array must be sorted first
//        Arrays.sort(array);
//
//        int index = Arrays.binarySearch(array, numberToSearchFor);
//        if (index >= 0) {
//            return true;
//        } else return false;
//    }

    public static void printTicket(int ticket[]) {
        for (int i = 0; i < LENGTH; i++) {
            System.out.print(ticket[i] + " | ");
        }
    }

}