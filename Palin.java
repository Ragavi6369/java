import java.util.Scanner;
class Palin
{
public static int reverse(int n)
{
int a=0;
while(n!=0)
{
int r=n%10;
a=(a*10)+r;
n=n/10;
}
return a;
}
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.print("Enter the number :");
int n=s.nextInt();

int i=n;
int first=reverse(n);
System.out.println(first);

if (i==first)
{
System.out.println("It is palindron");
}
else
{
System.out.println("It is not a palindrom");
}
}
}