import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
public class Serilizable1{
    public static void main(String[] args){
        Student student=new Student(1,"John ");
        try{
        FileOutputStream fileOut=new FileOutputStream("Student.ser");
        ObjectOutputStream out=new ObjectOutputStream(fileOut);
        out.writeObject(student);
        out.close();
        fileOut.close();
        System.out.println("Serilizable data is saved in student.ser");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
}