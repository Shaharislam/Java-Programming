package exceptions;
import java.io.File;
public class ExceptionsTest {

    public static void main(String args[]){
        createNewFile();
    }

    public static void createNewFile(){
        File file = new File("resources/nonexistent.txt");
        try{
            file.createNewFile();
        }catch (Exception e){
            System.out.println("Directory does not exist.");
            e.printStackTrace();
        }
    }
}
