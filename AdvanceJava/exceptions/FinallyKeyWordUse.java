package exceptions;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
public class FinallyKeyWordUse {
    public static void main(String args[]){
        finallyKeywordExceptionHandling();
    }
    public static void finallyKeywordExceptionHandling(){
        File file = new File("resources/numbers.txt");
        Scanner fileReader = null;
        try{
            fileReader = new Scanner(file);

            while(fileReader.hasNext()){
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        }catch(FileNotFoundException | InputMismatchException e){
            e.printStackTrace();
        }finally{
            fileReader.close();
        }
    }
}
