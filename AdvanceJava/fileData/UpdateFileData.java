package fileData;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.io.*;

public class UpdateFileData {
    public static void main(String[] args) {
        try{
            File dir = new File("/Users/rakibulshahar/Desktop/RN.text");
            System.out.println("File "+dir.getName()+" is Created");
//            Formatter formatter = new Formatter(dir);
//            formatter.format("%s  %s","100","Rakibul");
//            formatter.format("%s  %s","101","Rakib");
//            formatter.format("%s  %s","102","RBM");

            String fileName = dir.getAbsolutePath();
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String content = "Hello, world!";
            bufferedWriter.write(content);
            bufferedWriter.close();

        }catch (IOException e){
            System.out.println("Exception:= "+e);
            e.printStackTrace();
        }

            try{
                File dir = new File("/Users/rakibulshahar/Desktop/RN.text");
                String fileName = dir.getAbsolutePath();
                FileReader fileReader = new FileReader(fileName);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                }
                    bufferedReader.close();
            }catch (IOException e){
                e.printStackTrace();

            }
        }
    }

