import java.util.*;
public class String2
{
    public static void main(String[] args)
    {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the string :");
    String str=s.nextLine();
    int str2=str.length();
    System.out.println("length of the string :"+str2);
    System.out.println("substring :"+str2/2);
    }
}