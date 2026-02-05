import java.util.*;
public class Vector1{
    public static void main(String[] args){
        Vector<String> vector=new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");
        vector.add("Date");

        Vector<String> anothervector=new Vector<>(Arrays.asList("Elderberry","fig"));
        vector.addAll(anothervector);
        System.out.println("contains (Apple):"+vector.contains("Apple"));
        vector.remove("Banana");
        vector.removeAll(Arrays.asList("Cherry","Date"));
        System.out.println("Is vector empty:"+vector.isEmpty());
        System.out.println("Size of vector:"+vector.size());
        System.out.println("Elements in vector:");
        Iterator<String> iterator=vector.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        vector.forEach(System.out::println);
        vector.retainAll(Collections.singleton("Apple"));
        System.out.println("After retainAll:"+vector);
        vector.clear();
        System.out.println("After Clear:"+vector);

    }
}