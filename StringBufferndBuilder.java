public class StringBufferAndBuilder
{
    public static void main(String[] args)
    {
        System.out.println("String Buffer(Thread-safe)");

        StringBuffer sbf = new StringBuffer("Hello");
        System.out.println(sbf);
        sbf.append("World");
        System.out.println(sbf);
        sbf.delete(0,5);
        System.out.println(sbf);
        sbf.insert(5,"Java");
        System.out.println(sbf);
        sbf.replace(0,5,"Awesome");
        System.out.println(sbf);
        sbf.deleteCharAt(2);
        System.out.println(sbf);
        sbf.reverse();
        System.out.println(sbf);
        System.out.println("Capacity:"+sbf.capacity());
        sbf.ensurecapacity(50);
        System.out.println(sbf.capacity());
        System.out.println("Length :"+sbf.length());
        sbf.setLength(5);
        System.out.println("Length after :"+sbf.length());
        sbf.setCharAt(1,"i");
        System.out.println("set Char at:"+sbf);
        System.out.println("char(2):"+sbf.charAt(2));
        System.out.println("Sub string :"+sbf.subString(1,4));
        System.out.println("To String :"+sbf.toString());

    }
}