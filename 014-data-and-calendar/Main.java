import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        DateFormat formatter = new SimpleDateFormat();
        System.out.println(formatter.format(date));

        formatter = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(formatter.format(date));

        formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(formatter.format(date));
    }
}
