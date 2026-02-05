import java.util.Scanner;
class Reverse1
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.print("Enter the Number :");
int n=s.nextInt();

while(n!=0)
{
int a=n%10;
System.out.print(a);
n=n/10;
}
}
}