import java.io.*;
import java.nio.file.*;
public class fileHandling{
public static void main(String[] args){
    String filename="Example.txt";
    createFile(filename);
    writeFile(filename,"Hello, this is first line.\n");
    readFile(filename);
    appendFile(filename,"This line is append.\n");
    //deleteFile(filename);
}
public static void createFile(String filename){
    try{
        File file=new File(filename);
        if(file.createNewFile()){
            System.out.println("File created:"+file.getName());
        }
        else{
            System.out.println("File already exists");
        }
    }catch(IOException e){
        System.out.println("An error occured while creating an file.");
        e.printStackTrace();
    }
}
public static void writeFile(String filename,String content){
    try(FileWriter writer=new FileWriter(filename)){
        writer.write(content);
        System.out.println("File is writed successfully");
        System.out.println("File about employe.");
    }catch(IOException e){
        System.out.println("An error is occured while writing an file.");
        e.printStackTrace();
    }
}
public static void readFile(String filename){
    System.out.println("Reading the content in the file.");
    try(BufferedReader reader=new BufferedReader(new FileReader(filename))){
        String Line;
        while((Line=reader.readLine())!=null){
            System.out.println("content in the file:"+Line);
        }
    }catch(IOException e){
        System.out.println("An error occured while reading an file.");
        e.printStackTrace();
    }
}
public static void appendFile(String filename,String content){
    try(FileWriter writer=new FileWriter(filename,true)){
        writer.write(content);
        System.out.println("Content is append successfully.");
    }catch(IOException e){
        System.out.println("An error occured while appending an file.");
        e.printStackTrace();
    }
}
public static void deleteFile(String filename){
    try{
        Files.deleteIfExists(Paths.get(filename));
        System.out.println("file is successfully deleted.");
    }catch(IOException e){
        System.out.println("An error occured while deleting an file.");
        e.printStackTrace();
    }
}
}