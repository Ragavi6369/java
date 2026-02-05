import java.util.*;
public class LinkedHashSet2{
    public static void main(String[] args){
        try{
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the element:");
        String a=s.nextLine();
        System.out.println("Enter the element:");
        String b=s.nextLine();
        System.out.println("Enter the element:");
        String c=s.nextLine();
        
        LinkedHashSet<String> set=new LinkedHashSet<>();
        set.add(a);
        set.add(b);
        set.add(c);
        System.out.println(set);
        System.out.println("Size of set:"+set.size());
        System.out.println("Set is empty:"+set.isEmpty());
        LinkedHashSet<String> anotherSet=new LinkedHashSet<>(Arrays.asList("Ramakrishanan","Kavitha"));
        set.addAll(anotherSet);
        System.out.println(set);
        }
        catch(Exception e){
            System.out.println("Exception:"+e.getMessage());
        }
        finally{
            System.out.println("Final execution");
        }
        

        
    }
}