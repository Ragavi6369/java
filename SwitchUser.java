import java.util.Scanner;
class SwitchUser
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.print("Enter your name :");
String a=s.nextLine();
System.out.print("Enter your Email id :");
String b=s.nextLine();

System.out.print("Enter the User :");
int c=s.nextInt();

switch(c)
{
case 1:
{
System.out.println("Your password is 12345 ");
break;
}
case 2:
{
System.out.println("Your Password is 6789 ");
break;
}
case 3:
{
System.out.println("Your Password is 93759");
break;
}
case 4:
{
System.out.println("Your Password is 40762");
break;
}
case 5:
{
System.out.println("Your Password if 30587");
break;
}
default:
{
System.out.println("Password is not Generated");
break;
}
}





}
}