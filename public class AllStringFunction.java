public class AllStringFunction{
    public static void main(String[] args){
        String Str="Hello world";
        String str2="  heloo java world";
        System.out.println("length:"+str.length());
        System.out.println("CharAt(2):"+str.CharAt(2));
        System.out.println("index(j):"+str2.indexOf('j'));
        System.out.println("Last index Of(l):"+str.LastIndexOf('l'));
        System.out.println("Sub String(2,7):"+str.substring(2,7));
        System.out.println("Replace('l','*'):"+str.replace('l','*'));
        System.out.println("ReplaceAll('\\s+','-'):"+str.replaceAll("\\s+","-"));
        System.out.println("Equals:"+str.equals(str2));
        System.out.println("equalsIgonoreCase:"+str.trim().equalsIgonoreCase(str2.trim()));
        System.out.println("Compare:"+str.compareTo(str2));
        System.out.println("CompareToIgonoreCase:"+str.compareToIgonoreCase(str2));
        System.out.println("concat:"+str.concat("-Let's Learn"));
        String joined=String.join(",","java","Python","c++");
        System.out.println("Join:"+joined);
    }
}
