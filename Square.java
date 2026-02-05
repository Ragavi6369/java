import java.util.Scanner;
class Square
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.print("Enter the number :");
int n=s.nextInt();
int i=n;
int r=0;
int rev=0;
while (n!=0)
{
int a=n%10;
r=(r*10)+a;
n=n/10;
}
int c=r*r;
System.out.println(c);

int s2=i*i;
while(s2!=0)
{
int b=s2%10;
rev=(rev*10)+b;
s2=s2/10;
}
System.out.println(rev);

if (c==rev)
{
System.out.println("This is Adam Number");
}
else
{
System.out.println("This is not a Adam Number");
}
}
}