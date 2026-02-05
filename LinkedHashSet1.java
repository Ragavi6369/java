import java.util.*;
public class LinkedHashSet1{
    public static void main(String[] args){
        LinkedHashSet<String> set=new LinkedHashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Dates");
        System.out.println(set);
        LinkedHashSet<String> anotherSet=new LinkedHashSet<>(Arrays.asList("Eldercherry","fig"));
        set.addAll(anotherSet);
        System.out.println(set);
        System.out.println("Contains Apple:"+set.contains("Apple"));
        set.remove("Banana");
        set.removeAll(Arrays.asList("Cherry","Dates"));
        System.out.println("Set is Empty:"+set.isEmpty());
        System.out.println("Size of set:"+set.size());
        System.out.println("Elements is LinkedHashSet:");
        Iterator<String> iterator=set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        set.forEach(System.out::println);
        set.retainAll(Collections.singleton("Apple"));
        System.out.println("After retainAll:"+set);
    }
}