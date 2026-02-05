import java.util.Scanner;
class Main
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.print("Enter your Employee Name :");
String name=s.nextLine();
System.out.print("Enter your email id :");
String email=s.nextLine();
System.out.print("Enter your employee id :");
String id=s.nextLine();
System.out.print("Enter your place :");
String place=s.nextLine();

System.out.print("Enter Branch :");
String it=s.nextLine();
System.out.print("Enter Working hours:");
double percent=s.nextDouble();
System.out.print("Enter year of experiences :");
int year=s.nextInt();

Derived d=new Derived();
d.person(name,email,id,place);
d.student(it,percent,year);
}
}