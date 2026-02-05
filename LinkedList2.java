import java.util.LinkedList;
public class LinkedList2
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list=new LinkedList<>();
        list.addFirst(60);
        list.addLast(66);
        list.add(1,61);
        list.add(2,68);
        list.add(3,63);
        list.add(4,64);
        list.add(5,65);

        System.out.println("List :"+list);
        list.removeFirst();
        System.out.println("Deleting First element:"+list);

        boolean found=list.contains(63);
        System.out.println("List contains 63:"+found);

        LinkedList<Integer> reverseList=new LinkedList();

        for(int i=list.size()-1;i>=0;i=i-2)
        {
            reverseList.add(list.get(i));
        }
        System.out.println("Decrement by 2:"+reverseList);
    }
}