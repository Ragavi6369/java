import java.util.LinkedList;
public class LinkedList1
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list=new LinkedList<>();
        list.addFirst(10);
        list.addLast(40);
        list.add(1,20);
        System.out.println("Linked list:"+list);
        list.removeFirst();
        System.out.println("After deleting First:"+list);
        list.removeLast();
        System.out.println("After deleting last:"+list);
        list.add(0,10);
        list.add(20);
        list.remove(1);
        System.out.println("After deleting at position1:"+list);
        boolean found=list.contains(20);
        System.out.println("Search 20:"+found);
        LinkedList<Integer> reversedlist=new LinkedList();

        for(int i=list.size()-1;i>=0;i--)
        {
            reversedlist.add(list.get(i));
        }
        System.out.println("After reverse:"+reversedlist);
    }
}