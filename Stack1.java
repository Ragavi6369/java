import java.util.*;
public class Stack1{
    public static void main(String[] args){
        Stack<String> stack=new Stack<>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        stack.push("Date");
        
        System.out.println("Popped element:"+stack.pop());
        System.out.println("Position of Apple:"+stack.search("Apple"));
        System.out.println("Contains Banana:"+stack.contains("Banana"));
        System.out.println("Size of stack:"+stack.size());
        System.out.println("Stack elements:");
        Iterator<String> iterator=stack.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        stack.forEach(System.out::println);
        stack.clear();
        System.out.println("After clear stack:"+stack);
    }
}