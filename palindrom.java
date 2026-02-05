import java.util.Scanner;
class Palindrom
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.print("Enter a number :");
int n=s.nextInt();
int i=n;

int a=0;
while(n!=0)
{
int r=n%10;
a=(a*10)+r;

n=n/10;


}
System.out.println();
if(i==a)
{
System.out.println("It is palindrom");
}
else
{
System.out.println("It is not a palindrom");
}
}

}

