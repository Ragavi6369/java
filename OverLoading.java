import java.util.Scanner;
class OverLoading
{
public static void area(int a,int c)
{
System.out.println(a/c);
}
public static void area(double b,int a)
{
System.out.println(b*a);
}
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.print("Enter the value for a :");
int a=s.nextInt();
System.out.print("Enter the value for b :");
double b=s.nextInt();
System.out.print("Enter the value for c :");
int c=s.nextInt();
area(a,c);
area(b,a);
}
}