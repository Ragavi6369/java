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
        List<String> names=Arrays.asList("Alice","Bob","Charlie");
        names.forEach(name->System.out.println("Hello: "+name));

        String Original="JavaRockers";
        String encoded=Base64.getEncoder().encodeToString(Original.getBytes());
        String decoded=new String(Base64.getDecoder().decode(encoded));
        System.out.println("Original:"+Original);
        System.out.println("Encoded:"+encoded);
        System.out.println("Decoded:"+decoded);

        LocalDateTime now=LocalDateTime.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-YY HH:mm:ss");
        System.out.println("Formatted Date &Time:"+now.format(formatter));



        System.out.println("Using for Each Loop");
        for(String name:names){
            System.out.println("->"+name);
        }

        System.out.println("\n Sum using varargs:"+sum(10,20,30,40));
        Status status=Status.ACTIVE;
        System.out.println("Enum sample: status"+status);

        List<String> upperName=names.stream()
               .map(String::toUpperCase)
               .collect(Collectors.toList());
               System.out.println("name in uppercase(Using stream + collectors):"+upperName);
               
        Optional<String> fetchedName=names.stream()
                .filter(n -> n.startsWith("C"))
                .findFirst();
                System.out.println("Find name by using   fetch:"+fetchedName.orElse("Not Found"));
    }
}