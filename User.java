import java. util.Scanner;
class User
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.print("Enter your name :");
String a=s.nextLine();
System.out.print("Enter your Email id:");
String b=s.nextLine();

if(a!=b)
{
System.out.print("Enter user name :");
String c=s.nextLine();
System.out.print("Enter Password :");
String d=s.nextLine(); 
}
System.out.println("You Login Successfully");

System.out.print("Enter User Name :");
String e=s.nextLine();
System.out.print("Enter Password :");
String f=s.nextLine();



System.out.println("Yor are already logined");

}
}