class Operat
{
public static void main(String args[])
{
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int c=Integer.parseInt(args[2]);

System.out.print("Addition of A and B:");
System.out.println(a+b);
System.out.print("Subraction of A and B:");
System.out.println(a-b);
System.out.print("Multiple of A and B:");
System.out.println(a*b);
System.out.print("Division of A and B:");
System.out.println(a / b);
System.out.print("Modulas of A and B:");
System.out.println(a % b);

System.out.print("A and B are equal:");
System.out.println(a==b);
System.out.print("A and B are not equal:");
System.out.println(a!=b);
System.out.print("A is Greater than B:");
System.out.println(a>b);
System.out.print("B is Greater than A:");
System.out.println(b>a);
System.out.print("A is Smaller than B:");
System.out.println(a<b);
System.out.print("B is Smaller than A:");
System.out.println(b<a);
System.out.print("A >= B:");
System.out.println(a>=b);
System.out.print("A<=B:");
System.out.println(a<=b);

System.out.print("A < B && A < C :");
System.out.println(a<b && a<c);
System.out.print("A < B || A < C :");
System.out.println(a<b || a<c);
System.out.print("A > B && A > C :");
System.out.println(a>b && a>c);
System.out.print("A > B || A > C :");
System.out.println(a>b || a>c);

System.out.print("A&B :");
System.out.println(a&b);
System.out.print("A | B :");
System.out.println(a|b);
System.out.print("A ^ B :");
System.out.println(a^b);
System.out.print("A>>2 :");
System.out.println(a>>2);
System.out.print("B>>2 :");
System.out.println(b>>2);
System.out.print("C>>2 :");
System.out.println(c>>2);
System.out.print("A<<2 :");
System.out.println(a<<2);
System.out.print("B<<2 :");
System.out.println(b<<2);
System.out.print("C<<2 :");
System.out.println(c<<2);

System.out.print("(A+B)^2:)");
System.out.println(a^2 + b^2 + 2*a*b);

System.out.println(" a^2 + b^2 : " +(a*a  + b*b));
System.out.println("(a+b)^2 : "+ ((a + b) *(a+b) ));
}
}