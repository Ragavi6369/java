public class StringBuilder{
    public static void main(String[] args){
        StringBuffer sbf=new StringBuffer("Hello java ");
        System.out.println(sbf);
        sbf.append("programming");
        System.out.println(sbf);
        sbf.insert(5,",");
        System.out.println(sbf);
        System.out.println("Capacity:"+sbf.capacity());
        sbf.setLength(15);
        System.out.println("Length:"+sbf); 
    }
}