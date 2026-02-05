import java.util.Scanner;
public class MarkMain extends MarkInheritence
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.print("Enter mark 1: ");
int mark1=s.nextInt();
System.out.print("Enter mark 2: ");
int mark2=s.nextInt();
System.out.print("Enter mark 3: ");
int mark3=s.nextInt();
System.out.print("Enter mark 4: ");
int mark4=s.nextInt();
System.out.print("Enter mark 5: ");
int mark5=s.nextInt();
MarkInheritence m=new MarkInheritence();

int total=mark1+mark2+mark3+mark4+mark5;
System.out.println(total);

if (total>=400)
{
m.settercol5("Nehru college coimbatore");
System.out.println(m.gettercol5());
}
if(total>=450)
{
m.settercol4("Thiyagarajar college Chennai");
System.out.println(m.gettercol4());

}
if(total>=475)
{
m.settercol3("LOYALA");
System.out.println(m.gettercol3());
}
if(total>=480)
{
m.settercol2("SSN");
System.out.println(m.gettercol2());
}
if(total>=490)
{
m.settercol1("Anna University Chennai");
System.out.println(m.gettercol1());
}

}
}