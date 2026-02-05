import java.util.*;
public class HashMap1{
    public static void main(String[] args){
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"Apple");
        map.put(2,"Banana");
        map.put(3,"Cherry");
        System.out.println("HashMap:"+map);
        System.out.println();
        System.out.println("Value for key 2:"+map.get(2));
        System.out.println();
        map.remove(3);
        System.out.println("After removing key 3:"+map);
        System.out.println("Hash contines 1:"+map.containsKey(1));
        System.out.println();
        System.out.println("Hash containes cherry:"+map.containsValue("Cherry"));
        System.out.println();
        System.out.println("Iteration over HashMap");
        for(Integer key:map.keySet()){
            System.out.println("Key:"+key+",Value:"+map.get(key));
        }
        System.out.println();
        System.out.println("Hash Size:"+map.size());
        System.out.println();
        map.clear();
        System.out.println("After clear:"+map);
    }
}