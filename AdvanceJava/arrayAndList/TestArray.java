package arrayAndList;
import java.util.Random;
public class TestArray {
    private static final int LENGTH = 5;
    private static final int MAX_TICKET_NUMBER = 20;

    public static void main(String[] args){

        int[] ticket = generateNumbers();
        printTicket(ticket);
    }

    public static int[] generateNumbers(){

        int[] ticket = new int[LENGTH];
        Random random = new Random();

        for(int i=0; i< LENGTH; i++){
            ticket[i] = random.nextInt(MAX_TICKET_NUMBER) + 1;
        }

        return ticket;
    }

    public static void printTicket(int ticket[]){
        System.out.println();
        for(int i=0; i<LENGTH; i++){
            System.out.println("Ticket["+i+"] = "+ticket[i]);
        }
    }
}
