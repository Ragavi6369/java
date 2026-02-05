class Overload
{
public static void area(int a)
{
System.out.println(a*a);
}
public static void area(int l,int b)
{
System.out.println(l*b);
}
public static void area(double r)
{
System.out.println(3.14*r*r);
}
public static void area(int l,int b,int h)
{
System.out.println(l*b*h);
}
public static void circumference(int c)
{
System.out.println(4*c);
}
public static void perimeter(int l,int w)
{
System.out.println(2*(l+w));
}
public static void perimeter(double r1)
{
System.out.println(2*3.14*r1);
}
public static void perimeter(int d,int e,int f)
{
System.out.println(d+e+f);
}
public static void main(String args[])
{
area(4);
area(6,2);
area(3.1);
area(5,8,12);
circumference(6);
perimeter(2,4);
perimeter(4);
perimeter(5,8,1);
}
}