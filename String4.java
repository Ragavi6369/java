public class String4
{
public static void main(String[] args)
{
    String str="  Hello java world ";
    String str2="hello java world";
    System.out.println("Trim():["+str.trim()+"]");
    System.out.println("Strip():["+str.strip()+"]");
    System.out.println("Strip Leading():["+str.stripLeading()+"]");
    System.out.println("Strip Trailing():["+str.stripTrailing()+"]");
    System.out.println("Upper Case:"+str.toUpperCase());
    System.out.println("Lower Case:"+str.toLowerCase());
    System.out.println("Starts With(\"  He\"):"+str.startsWith("  He"));
    System.out.println("Ends With(\"ld\"):"+str.endsWith(" ld"));
    System.out.println("Contains(\"java\"):"+str.contains("java"));
    String[] Words=str.trim().split(" ");
    System.out.println("Split by space :");
    for(String Word:Words)
    {
        System.out.println(Word);
    }
    System.out.println("Matches(\".*java.*\"):"+str.matches(".*java.*"));
    String emptystr=" ";
    String blankstr=" ";
    System.out.println("Is Empty str:"+emptystr.isEmpty());
    System.out.println("Is Blank Str:"+blankstr.isBlank());
    int number=50;
    System.out.println("value of(int):"+str.valueOf(number));
    String formatted=String.format("Hello ,%s! you scored %d%%.","Alice",96);
    System.out.println("Format function:"+formatted);
}
}