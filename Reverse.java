import java.util.Scanner;
class Reverse
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.print("Enter a number :");
int a=s.nextInt();
int f=0;
while(a<50)
{
f=a%10;


System.out.print(f);

break;
}
}
}
