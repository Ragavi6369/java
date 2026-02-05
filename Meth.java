import java.util.Scanner;
class Meth
{
public static int square(int n)
{
return n*n;
}

public static int compare(int n,int a)
{
if(n==a)
{
System.out.println("Both are equal");
}
else
{
System.out.println("Both are not equal");
}
}

public static String name(String nam)
{
System.out.println("Name :");
}

public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.print("Enter the number :");
int n=s.nextInt();
System.out.print("Enter your name :");
String nam=s.nextLine();
int num=square(n);
System.out.println(num);
compare(n,6);
name(nam);
}
}
