class LogicFive
{
public static void main(String args[])
{
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int c=Integer.parseInt(args[2]);
int d=Integer.parseInt(args[3]);
int e=Integer.parseInt(args[4]);

System.out.print("A is greater: ");
System.out.println(a>b && a>c && a>d && a>e);
System.out.print("A is Smaller: ");
System.out.println(a<b && a<c && a<d && a<e);

System.out.print("B is greater: ");
System.out.println(b>a && b>c && b>d && b>e);
System.out.print("B is Smaller: ");
System.out.println(b<a && b<c && b<d && b<e);

System.out.print("C is greater: ");
System.out.println(c>a && c>b && c>d && c>e);
System.out.print("C is Smaller: ");
System.out.println(c<a && c<b && c<d && c<e);

System.out.print("D is greater: ");
System.out.println(d>a && d>b && d>c && d>e);
System.out.print("D is Smaller: ");
System.out.println(d<a && d<b && d<c && d<e);

System.out.print("E is greater: ");
System.out.println(e>a && e>b && e>c && e>d);
System.out.print("E is Smaller: ");
System.out.println(e<a && e<b && e<c && e<d);
}
}