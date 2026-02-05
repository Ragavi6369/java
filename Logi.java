class Logi
{
public static void main(String args[])
{
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int c=Integer.parseInt(args[2]);

System.out.print("A is Smaller :");
System.out.println(a<b && a<c);

System.out.print("A is Smaller :");
System.out.println(a<b || a<c);

System.out.print("A is greater :");
System.out.println(a>b && a>c);

System.out.print("A is greater :");
System.out.println(a>b || a>c);
}
}