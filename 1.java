import java.sql.*;
import java.util.Scanner;
public class sqlwithjava{
    static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
    static final String DB_USER = "system";
    static final String DB_PASSWORD = "livewire";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             Scanner sc = new Scanner(System.in)) {

            Class.forName("oracle.jdbc.driver.OracleDriver");
            while(true)
            {

                System.out.println("Staff Login");
                System.out.println("student Login");
                System.out.println("Registration");
                System.out.println("Exit");
                System.out.println("Enter option");
                int ch=sc.nextInt();
                switch(ch){
                    case 1: {
                        System.out.println("Student Details");
                        System.out.println("Admisition Details");
                        System.out.println("Particular Student");
                        System.out.println("Enter choice:");
                        int ch1=sc.nextInt();
                        switch(ch1)
                        {
                            case 1:
                            {

                                String sql="SELECT * FROM STUDENT";
                                try(Statement st=conn.createStatement();
                                    ResultSet rs=st.executeQuery(sql)){
                                    System.out.println("Name|RollNo|Dob|Dept");
                                    while(rs.next()){
                                        System.out.println(
                                                rs.getString("Name")+"|"+
                                                        rs.getInt("RollNo")+"|"+
                                                        rs.getString("Dob")+"|"+
                                                        rs.getString("Dept"));

                                    }
                                }
                                break;
                            }
                            case 2:
                            {

                                String sql="SELECT * FROM STUDENT";
                                try(Statement st=conn.createStatement();
                                    ResultSet rs=st.executeQuery(sql)){
                                    System.out.println("Name|RollNo|Dob|Dept");
                                    while(rs.next()){
                                        System.out.println(
                                                rs.getString("Name")+"|"+
                                                        rs.getInt("RollNo")+"|"+
                                                        rs.getString("Dob")+"|"+
                                                        rs.getString("Dept"));

                                    }
                                }
                                break;
                            }
                            case 3:
                            {
                                sc.nextLine();
                                System.out.println("Enter Student name:");
                                String name2=sc.nextLine();
                                String sql="SELECT * FROM STUDENT WHERE NAME=?";
                                try(PreparedStatement ps=conn.prepareStatement(sql)){
                                    ps.setString(1,name2);
                                    ResultSet rs=ps.executeQuery();
                                    if(rs.next()){
                                        System.out.println("NAME:"+rs.getString("NAME"));
                                        System.out.println("ROLLNO"+rs.getInt("ROLLNO"));
                                        System.out.println("DOB"+rs.getString("DOB"));
                                        System.out.println("DEPT"+rs.getString("DEPt"));
                                    }
                                    else{
                                        System.out.println("Student not found");
                                    }
                                }
                                break;
                            }
                        }
                    }
                    case 2:
                    {
                        sc.nextLine();
                        System.out.println("Enter Student Name:");
                        String name1=sc.nextLine();
                        String sql="SELECT * FROM STUDENT WHERE NAME=?";
                        try(PreparedStatement ps=conn.prepareStatement(sql)){
                            ps.setString(1,name1);
                            ResultSet rs=ps.executeQuery();
                            if(rs.next()){
                                System.out.println("NAME:"+rs.getString("NAME"));
                                System.out.println("ROLLNO"+rs.getInt("ROLLNO"));
                                System.out.println("DOB"+rs.getString("DOB"));
                                System.out.println("DEPT"+rs.getString("DEPT"));
                            }
                            else{
                                System.out.println("Student not found");
                            }
                        }
                        break;
                    }
                    case 3:
                    {
                        System.out.println("Registration");
                        sc.nextLine();
                        System.out.println("Enter student Name:");
                        String name=sc.nextLine();
                        System.out.println("Enter Roll number:");
                        int rollNo=sc.nextInt();
                        sc.nextLine();
                        System.out.println("Date of Birth:");
                        String dob=sc.nextLine();
                        System.out.println("Enter Department:");
                        String dept=sc.nextLine();
                        String sql="INSERT INTO STUDENT(NAME,ROLLNO,DOB,DEPT) VALUES(?,?,?,?)";
                        try (PreparedStatement ps=conn.prepareStatement(sql))
                        {
                            ps.setString(1,name);
                            ps.setInt(2,rollNo);
                            ps.setString(3,dob);
                            ps.setString(4,dept);

                            int rows=ps.executeUpdate();
                            System.out.println(rows+"Student(s) inserted.");
                        }
                        break;

                    }
                    case 4:
                    {
                        System.out.println("Exiting");
                        break;
                    }
                    default:
                    {
                        System.out.println("Error");
                        break;
                    }
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
