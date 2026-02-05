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

        System.out.println("Vector contains "Apple"":+vector.contains("Apple"));
        vector.remove("Banana");
        vector.removeAll(Arrays.asList("Cherry","Date"));
        System.out.println("Is vector empty:"+vector.isEmpty());
        System.out.println("Size of vstor:"+vector.Size());
        System.out.println("Elements in vector:");
        Iteration<String> iteration=vector.iteration();
        while(iteration.hasNext()){
            System.out.println(iteration.next());
        }
        vector.forEach(System.out::println);
        vector.retainAll(collection.singleton("Apple"));
        System.out.println("After retainAll:"+vector);
        vector.clear();
        System.out.println("After Clear:"+vector);

    }
}