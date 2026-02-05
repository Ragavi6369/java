import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class DeSerializable{
    public static void main(String[] args){
        try{
        FileInputStream filein=new FileInputStream("Student.ser");
        ObjectInputStream in=new ObjectInputStream(filein);
        Student student=(Student) in.readObject();
        in.close();
        filein.close();
        System.out.println("Deserailizable student");
        student.display();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}