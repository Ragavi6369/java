import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
public class inter{
    public static void main(String[] args){
        Locale[] locales={
            Locale.US,
            Locale.FRANCE,
            Locale.JAPAN,
            new Locale("hi","IN")
        };

        Date now=new Date();
        double sampleNumber=1234567.89;

        for(Locale locale:locales)
        {
        System.out.println("=====================");
        System.out.println("Locale:"+locale.getDisplayLanguage()+locale.getCountry());
        System.out.println("Language:"+locale.getDisplayLanguage());
        System.out.println("Country code:"+locale.getCountry());

        Currency currency=Currency.getInstance(locale);
        System.out.println("Currency:"+currency.getCurrencyCode()+"-"+currency.getSymbol(locale));

        DateFormat  dateFormat=DateFormat.getDateInstance(DateFormat.LONG,locale);
        System.out.println("DateFormat:"+dateFormat.format(now));

        DateFormat timeFormat=DateFormat.getTimeInstance(DateFormat.SHORT,locale);
        System.out.println("TimeFormat:"+timeFormat.format(now));

        NumberFormat numberFormat=NumberFormat.getInstance(locale);
        System.out.println("NumberFormat:"+numberFormat.format(sampleNumber));
        }
    }
}