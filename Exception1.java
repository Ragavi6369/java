import java.util.*;
public class Exception1{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value for a:");
        int a=s.nextInt();
        System.out.println("Enter the value for b:");
        int b=s.nextInt();
        try{
            int c=a/b;
            }
        catch(Exception e){
            System.out.println("Exception:"+e.getMessage());
            throw new RuntimeException("Custom Exception Message.",e);
        }
        finally{
            System.out.println("Finally block executed.");
        }
        System.out.println("Continuous after exception handling.");
    }
}