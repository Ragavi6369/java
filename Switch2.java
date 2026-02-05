import java.util.Scanner;
class Switch2
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);


System.out.print("Enter the number :");
int j=s.nextInt();
int l=5;
while(l>j)
{
System.out.print("Enter the choice :");
int k=s.nextInt();
{
switch(k)
{
case 1:
{
System.out.print("Enter the number :");
int n=s.nextInt();
System.out.println();

while(n!=0)
{
int a=n%10;
n=n/10;
System.out.print(a);

}
System.out.println();
break;

}
case 2:
{
System.out.print("Enter the number :");
int n=s.nextInt();
System.out.println();
System.out.print("Armstrong number ");
int i=0;
int r=0;
while(n!=0)
{
int a=n%10;
n=n/10;
r=a*a*a;
i=i+r;
}
System.out.println(i);
break;
}
case 3:
{
System.out.println();

{
System.out.print("Enter the value :");
int e=s.nextInt();
int i=e;
int r=0;
int rev=0;
while(e!=0)
{
int a=e%10;
r=(r*10)+a;
e=e/10;
}
int c=r*r;
System.out.println(c);
System.out.println();
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
System.out.println("It is adam number");
}
else
{
System.out.println("It is not a adam number");
}
break;
}
}
case 4:
{
System.out.println();
System.out.print("Factorial ");
System.out.print("Enter value :");
int d=s.nextInt();
int a=1;
int r=0;
int c=1;
while(d!=0)
{
r=d*a;
d=d-1;
c=(c*1)*r;
}
System.out.println(c);
break;
}
default:
{
System.out.println("Exit");
break;
}
}
}
}
j=j+1;
}
}