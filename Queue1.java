import java.util.*;
public class Queue1{
    public static void main(String[] args){
        Queue queue=new LinkedList<>();
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");
        queue.add("Dates");

        
        System.out.println("Polled element:"+queue.poll());
        System.out.println("Queue is empty"+queue.isEmpty());
        System.out.println("Queue contains Apple:"+queue.contains("Apple"));
        System.out.println("Size of queue:"+queue.size());
        System.out.println("Queue elements:");
        Iterator<String> iterator=queue.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        queue.forEach(System.out::println);
        queue.clear();
        System.out.println("After clear:"+queue);
    }
}