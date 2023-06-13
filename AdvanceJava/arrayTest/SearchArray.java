package arrayTest;
import java.util.Arrays;
import java.util.Random;
public class SearchArray {
    private static final int LENGTH = 3;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args) {

        int[] ticket = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);
    }

    public static int[] generateNumbers() {

        int[] ticket = new int[LENGTH];

        Random random = new Random();

        for (int i = 0; i < LENGTH; i++) {
            int randomNumber;
            randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            /**
            Generate random number then search to make sure it doesn't
            already exist in the array. If it does, regenerate and search again.
             **/
//            do {
//                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
//                System.out.println("Ticket: "+ticket[i]+"   Random Number:= "+randomNumber);
//            } while (search(ticket, randomNumber));

            //Number is unique if we get here. Add it to the array.
            ticket[i] = randomNumber;
            System.out.println("Ticket: "+ticket[i]+"   Random Number:= "+randomNumber);
        }

        return ticket;
    }

    /*
     * Does a sequential search on the array to find a value
     *
      param array             Array to search through
      param numberToSearchFor Value to search for
     * @return true if found, false if not
     */
//    public static boolean search(int[] array, int numberToSearchFor) {
//
//        /*
//          This is called an enhanced loop.
//          It iterates through 'array' and
//          each time assigns the current element to 'value'
//         */
//        //System.out.println("NumberToSearchFor = "+numberToSearchFor);
//        for (int value : array) {
//            System.out.println("Value:= "+value+ "    NumberToSearchFor = "+numberToSearchFor);
//            if (value == numberToSearchFor) {
//                return true;
//            }
//        }
//
//        /*
//          If we've reached this point, then the entire array was searched
//          and the value was not found
//         */
//        return false;
//    }

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