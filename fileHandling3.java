import java.io.*;
import java.util.Scanner;
public class fileHandling3{
    public static void main(String args[]){
        String filename="example4.txt";
        Scanner s=new Scanner(System.in);
        
        System.out.println("Employe name:");
        String name=s.nextLine();
        System.out.println("Employe id:");
        String id=s.nextLine();
        System.out.println("Employe department:");
        String dept=s.nextLine();
        System.out.println("Employe salary:");
        String salary=s.nextLine();
        System.out.println("Employe details are added successfully.");
    createFile(filename);
        writeFile(filename,"Employe 1 details:\n"+name+" "+id+" "+dept+" "+salary+"\n");
        readFile(filename);
        }
    public static void createFile(String filename){
        try{
            File file=new File(filename);
            if(file.createNewFile()){
                System.out.println("File is created.");
            }
            else{
                System.out.println("File already exists.");
            }
        }catch(IOException e){
            System.out.println("An error is occured while creating an file.");
            e.printStackTrace();
        }
    }
    public static void writeFile(String filename,String content){
        try (FileWriter writer=new FileWriter(filename)){
            writer.write(content);
            
            System.out.println("how many students:");
        }catch(IOException e){
            System.out.println("An error is occured while write an file.");
            e.printStackTrace();
        }
    }
    public static void readFile(String filename){
        try(BufferedReader reader=new BufferedReader (new FileReader(filename))){
            String line;
            while((line=reader.readLine())!=null){

                System.out.println(" "+line);
             
            }
        }catch(IOException e){
            System.out.println("An error is occured while reading an file.");
            e.printStackTrace();
        }
    }
}
