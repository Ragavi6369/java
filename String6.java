import java.util.*;
public class String6
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Student Details");
        System.out.println("Enter the number of students in class:");
        int n=s.nextInt();
        int i=0;
        s.nextLine();
        String[] name=new String[n];
        for(i=0;i<n;i++)
        {
             System.out.println("Enter the Student name:");
             name[i]=s.nextLine();
        }
        System.out.println("Enter what would you do:\n1.matches\n2.change name \n");
        System.out.println("Enter your choice:");
        int c=s.nextInt();
        s.nextLine();
        switch(c)
        {
            case 1:
            {
                System.out.println("Match the name");
                System.out.println("Enter the name:");
                String str1=s.nextLine();
                System.out.println("Match(\".*str1.*\"):"+name[0].matches(str1));
                break;
            }
            case 2:
            {
                System.out.println("Change the name");
                System.out.println("Enter the new name:");
                String changename=s.nextLine();
                System.out.println("The replace name:");
                System.out.println(name[0].replace(name[0],changename));
                System.out.println();
                
                break;
            }
            default:
            {
                System.out.println("Exit");
                break;
            }
            
        }
       
    }
}