import java.util.Scanner;
class Switch1
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.print("Enter the method :");
int a=s.nextInt();
switch(a)
{
int a=0;
case 1:
{
System.out.println("Reverse of the given number");
System.out.print("Enter the method :");
int n=s.nextInt();
while(n!=0)
{
a=n%10;
System.out.print("Reverse :"+a);
n=n/10;
}
}
case 2:
{
System.out.println("Armstrong");
System.out.print("Enter the method :");
int n=s.nextInt();
int i=0;
int r=0;
while(n!=0)
{
a=n%10;
n=n/10;
r=a*a*a;
i=i+r;
}
System.out.println(i);
}
case 3:
{
System.out.println("Adam number");
System.out.print("Enter the method :");
int n=s.nextInt();
int i=n;
int r=0;
int rev=0;
while(n!=0)
{
a=n%10;
r=(r*10)+a;
n=n/10;
}
System.out.print(r*r);
System.out.println();
int s2=i*i;
while(s2!=0)
{
int b=s2%10;
rev=(rev*10)+b;
s2=s2/10;
}
System.out.println(rev);
}
case 4:
{
System.out.println("Factorial of a number");
System.out.print("Enter the method :");
int n=s.nextInt();
a=1;
int r=0;
int c=1;
while(n!=0)
{
r=n*a;
n=n-1;
c=(c*1)*r;
}
System.out.println(c);
}
default:
{
System.out.println("Exit");
}
}
}
}
