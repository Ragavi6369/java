class MidValue
{
public static void main(String args[])
{
int a= Integer.parseInt(args[0]);
int b= Integer.parseInt(args[1]);
int c= Integer.parseInt(args[2]);
int d=Integer.parseInt(args[3]);
int e=Integer.parseInt(args[4]);

System.out.print(" A is Mid Value: ");
System.out.println(c>a && b>a && d<a && e<a || c>a && d>a && b<a && e<a || e>a && d>a && b<a && c<a);

System.out.print(" B is Mid Value: ");
System.out.println(c>b && a>b && d<b && e<b || c>b && d>b && a<b && e<b || e>b && d>b && a<b && c<b );

System.out.print(" C is Mid Value: ");
System.out.println(b>c && a>c && d<c && e<c || b>c && d>c && a<c && e<c || e>c && d>c && a<c && b<c);

System.out.print(" D is Mid Value: ");
System.out.println(b>d && a>d && c<d && e<d || b>d && c>d && a<d && e<d || e>d && c>d && a<d && b<d);

System.out.print(" E is Mid Value: ");
System.out.println(b>e && a>e && c<e && d<e || b>e && c>e && a<e && d<e || d>e && c>e && a<e && b<e);

System.out.print


}
}