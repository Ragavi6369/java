import java.util.Scanner;
public class String9
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=s.nextLine();
        String[] str2={"a","e","i","o","u","A","E","I","O","U"};
        int a=0;
        int b=0;
        
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            
            
                if(c==str2[i].charAt(i))
                {
                    a=a+1;
                    System.out.println(a);
                }
                else
                {
                    b=b+1;
                    System.out.println(b);

                }
            }
            
        }
        
    
}