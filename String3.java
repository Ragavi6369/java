import java.util.*;
public class String3
{
public static void main(String[] args)
{
    Scanner s=new Scanner(System.in);
    System.out.println("Menu \n1.String \n2.String length \n3.String character \n4.String index \n5.String sub String \n6.String replace \n7.String equals \n8.String concatenate \n9.String campare");
    System.out.println("Enter the string :");
    String str=s.nextLine();
    System.out.println("what would you like to do :");
    int n=s.nextInt();
    switch(n)
    {
        case 1:
        {
            System.out.println(str);
            break;
        }
        case 2:
        {
            System.out.println(str.length());
            break;
        }
        case 3:
        {
            System.out.println("Enter the index value:");
            int ch=s.nextInt();
            System.out.println("Character at ch:"+str.charAt(ch));
            break;
        }
        case 4:
        {
            System.out.println("Enter the character:");
            String c=s.nextLine();
            System.out.println(str.indexOf(c));
            break;
        }
        case 5:
        {
            System.out.println("substring(2,7) :"+str.substring(2,7));
            break;
        }
        case 6:
        {
            System.out.println("Enter the char:");
            String r=s.nextLine();
            System.out.println("Enter the replace char:");
            String re=s.nextLine();
            System.out.println("Replace(r,re):"+str.replace(r,re));
            break;
        }
        case 7:
        {
            System.out.println("Enter the second string :");
            String str2=s.nextLine();
            System.out.println(str.equals(str2));
            break;
        }
        case 8:
        {
            System.out.println("Second String :");
            String st=s.nextLine();
            System.out.println("String concatenate:"+str.concat(st));
            break;
        }
        case 9:
        {
            System.out.println("Enter second String :");
            String str3=s.nextLine();
            System.out.println("String compare:"+str.compareTo(str3));
            break;
        }
    }
   
}
}