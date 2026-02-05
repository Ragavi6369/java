class Star
{
public static void main(String args[])
{
for (int i=1;i<5;i++)
{
for (int j=5;j>i;j--)
{
for (int k=0;k<j;k--)
{
System.out.print("  ");
}
System.out.print(" * ");
}
System.out.println();
}
}
}