import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialize2 {
    public static void main(String[] args) {
        Employee3 enoloyee = new Employee3(1, "John Doe",20000,2,24);

        try {
            FileOutputStream fileOut = new FileOutputStream("Employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(employee);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in employee.ser");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}