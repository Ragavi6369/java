import java.util.*;
public class String1
{
    public static void main(String[] args)
    {
    Scanner s=new Scanner(System.in);
    System.out.print("Enter the string :");
    String str=s.nextLine();
    int str2=str.length();
    System.out.println("length of the string :"+str2);
    int sub=str2/2;
    System.out.println("Sub String:"+sub);
    System.out.println("Substing :"+str.substring(0,sub));
    System.out.println("Second sub string:"+str.substring(sub,str2));
    }
}