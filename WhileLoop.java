import java.util.Scanner;
class WhileLoop
{
public static void main(String args[])
{

int c=1;
while(c<=2)
{

Scanner s=new Scanner(System.in);
System.out.print("Enter your name :");
String name=s.nextLine();
System.out.print("Enter your Email id :");
String email=s.nextLine();


System.out.print("Enter your Username :");
String user=s.nextLine();


System.out.print("Enter your Password :");
String password=s.nextLine();

if ( user.equals(user))
{
System.out.println("You are  logined");
}
c=c+1;




}
System.out.println("You are already logined");
System.out.println();

}
}
