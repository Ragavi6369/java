import java.util.Scanner;
class Name
{
public static void display()
{
Scanner sca=new Scanner(System.in);
System.out.print("Enter your name :");
String name=sca.nextLine();
System.out.print("Enter your date of birth :");
String dob=sca.nextLine();
System.out.print("Enter you native place :");
String place=sca.nextLine();
System.out.print("Enter age :");
int age=sca.nextInt();
}
}