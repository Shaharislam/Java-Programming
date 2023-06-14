package exceptions;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import  java.util.InputMismatchException;
public class ExceptionHandling {
    public static void main(String args[]){
        numbersExceptionHandling();
    }

    public static void numbersExceptionHandling(){
        File file = new File("resources/numbers.txt");
        try{
            Scanner fileReader = new Scanner(file);

            while(fileReader.hasNext()){
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        }catch(FileNotFoundException | InputMismatchException e){
            System.out.println();
            e.printStackTrace();
        }catch (Exception e){
            System.out.println();
            e.printStackTrace();
        }
    }
}
