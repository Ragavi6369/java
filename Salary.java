import java.util.Scanner;
class Salary
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.print("Enter employee Name: ");
String a=s.nextLine();
System.out.print("Enter your Age :");
int b=s.nextInt();

if (b>=21)
{

System.out.print("Years of job Experience :");
int c=s.nextInt();

switch(c)
{

case 1:
{
System.out.println("Your Salary is 20k");
break;
}
case 2:
{
System.out.println("Your Salary is 30k");
break;
}
case 3:
{
System.out.println("Your Salary is 40k");
break;
}
case 4:
{
System.out.println("Your Salary is 50k");
break;
}
case 5:
{
System.out.println("Your Salary is 70k");
break;
}
default:
{
System.out.println("Invalid");
}
}
}
else 
{
System.out.println("We want more experiece");
}
}
}