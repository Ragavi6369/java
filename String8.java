import java.util.*;
public class String8
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=s.nextLine();
        String[] str2={"This","is","a"};
        String[] sentence=str.trim().split(" ");
        
        for(String word:sentence)
        {
          for(String w:str2)
          {
              if(word.equals(w))
              {
                  System.out.println(w.replace(word," "));
              }
          }
          System.out.println(word);
          
        } 
        
    }
    
    
    
}