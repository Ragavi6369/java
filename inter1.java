import java.util.*;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
public class inter1{
    public static void main(String[] args){
        Locale[] locales={
            Locale.US,
            Locale.FRANCE,
            Locale.JAPAN,
            new Locale("hi","IN")
        };
        Date now=new Date();
        double sampleNumber=123456.78;
        for(Locale locale:locales){
            System.out.println("============");
            System.out.println("Locale:"+locale.getDisplayLanguage()+","+locale.getCountry());
            System.out.println("Language:"+locale.getDisplayLanguage());
            System.out.println("Country:"+locale.getCountry());
            Currency currency=Currency.getInstance(locale);
            System.out.println("Currency:"+currency.getCurrencyCode()+"-"+currency.getSymbol(locale));
            DateFormat dateFormat=DateFormat.getDateInstance(DateFormat.LONG,locale);
            System.out.println("Formatted Date:"+dateFormat.format(now));
            DateFormat timeFormat=DateFormat.getTimeInstance(DateFormat.SHORT,locale);
            System.out.println("Formatted Time:"+timeFormat.format(now));
            NumberFormat numberFormat=NumberFormat.getInstance(locale);
            System.out.println("Formatted Number:"+numberFormat.format(sampleNumber));
        }
    }
}
