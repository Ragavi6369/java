class Method
{
public static void data()
{
System.out.println("This is new data");
}
public static void add(int a,int b)
{
System.out.println(a+b);
}
public static int sub(int a, int b)
{
return (a-b);
}
public static void info()
{
System.out.println("Info");
}
public static void main(String args[])
{
data();
add(12,87);
int c=sub(54,5);
System.out.println(c);

info();
}
}