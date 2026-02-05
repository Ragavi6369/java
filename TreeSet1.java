import java.util.*;
public class TreeSet1{
    public static void main(String[] args){
        TreeSet set=new TreeSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Date");

        TreeSet<String> anotherSet=new TreeSet<>(Arrays.asList("ElderCherry","Fig"));
        set.addAll(anotherSet);

        System.out.println("Set contains(Apple):"+set.contains("Apple"));
        set.remove("Banana");
        set.removeAll(Arrays.asList("Cherry","Date"));
        System.out.println("Is set empty:"+set.isEmpty());
        System.out.println("Size of the set:"+set.size());
        System.out.println("Elements in set:");
        Iterator<String> iterator=set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        set.forEach(System.out::println);
        set.retainAll(Collections.singleton("Apple"));
        System.out.println("After retainAll :"+set);
        set.clear();
        System.out.println("After clear set:"+set);
    }
}