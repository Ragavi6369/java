import java.util.*;
import java.util.stream.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

public class inter2{
    enum Status{
        ACTIVE,INACTIVE,PENDING;
    }
    public static int sum(int...nums){
        return Arrays.stream(nums).sum();
    }
    public static void main(String[] args){
        List <String> names=Arrays.asList("Alice","Bob","Charlie");
        names.forEach(name -> System.out.println("Hello",name));

        String original="JavaRockers";
        String encoded=Base64.getEncoder().encodeToString(original.getBytes());
        String decoded=new String(Base64.getDecoder().decode(encoded));

        System.out.println("Original:"+original);
        System.out.println("Encoded:"+encoded);
        System.out.println("Decoded:"+decoded);

        LocalDateTime now= LocalDateTime.now();
        DateTimeForamtter formatter= DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Formatter date Time:"+now.format(formatter));

        System.out.println("\nUsing for each-loop");
        for(String name:names){
            System.out.println("->"+name);
        }
        System.out.println("\n Sum using varargs:"+ sum(10,20,30,40));
        Status status=status.ACTIVE;
        System.out.println("\n Enum sample:Status:"+status);
    }
}