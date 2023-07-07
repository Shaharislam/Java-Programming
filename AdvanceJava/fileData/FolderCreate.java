package fileData;

import java.io.File;

public class FolderCreate {
    public static void main(String[] args) {
        File dir = new File("/Users/rakibulshahar/Desktop/Rakibul_Shahar"); // for mac / and for windows \\
        dir.mkdir(); // create folder;
        String fileLocation = dir.getAbsolutePath();
        System.out.println("Your Folder Name := "+dir.getName());
        System.out.println("Folder Location:= "+fileLocation);

        // Deleted a Folder
//        if (dir.delete()){
//            System.out.println("Deleted this "+dir.getName()+"  folder from "+dir.getAbsolutePath());
//        }

        String path = dir.getAbsolutePath();
        File file1 = new File(path+"/student.text"); // this is a way for create file with a location
        File file2 =new File("/Users/rakibulshahar/Desktop/Rakibul_Shahar/teacher.text"); // this is another way

        try{
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("Student New File:= "+file1.getName()+" Location:= "+file1.getAbsolutePath());
            System.out.println("Teacher New File:= "+file2.getName()+" Location:= "+file2.getAbsolutePath());
        }catch (Exception e){
            System.out.println(e);
        }

        if(file1.exists()){
            System.out.println("File: "+file1.getName()+ " Exists");
        }
    }
}
