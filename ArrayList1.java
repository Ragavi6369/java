import java.util.ArrayList;
import java.util.List;
public class ArrayList1{
    public static void main(String[] args){
        ArrayList<String> list=new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("ArrayList:"+list);
        System.out.println("First Element:"+list.get(0));
        list.set(1,"Blueberry");
        System.out.println("After Updating:"+list);
        list.remove("Cherry");
        System.out.println("After deleting cherry:"+list);
        System.out.println("Array contains(Apple):"+list.contains("Apple"));
        System.out.println("Size of the Array:"+list.size());
        System.out.println("Iterating through Arraylist:");
        for(String item:list)
        {
            System.out.println(item);
        }
        list.clear();
        System.out.println("List after clear:"+list.isEmpty());
    }
}