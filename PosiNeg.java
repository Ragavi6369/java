import java.util.Scanner;
class PosiNega
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.print("Enter a Number:");
int a=scan.nextInt();

if (a>0)
{
System.out.println("A is Positive");
}
if (a<0)
{
System.out.println("A is Negative");
}
if (a==0)
{
System.out.println(" 0 is a netral number");
}
}

}