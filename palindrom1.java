import java.util.Scanner;
class Palindrom1
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.print("Enter the number :");
int n=s.nextInt();
int a=0;
while(n!=0)
{
int r=n%10;
a=(a*10)+r;
n=n/10;
}

.0

if (i==a)
{
System.out.println("It is Palindrom");
}
else
{
System.out.println("It is not a palindrom");
}
}
}