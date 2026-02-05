class MiddleEle
{
public static void main(String args[])
{
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int c=Integer.parseInt(args[2]);

System.out.print("B is smaller :");
System.out.println(a>b && b<c );
System.out.print("B is Greater :");
System.out.println(a<b && b>c );
}
}