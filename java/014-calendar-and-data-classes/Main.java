import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        // Calendar instance
        Calendar calendar = Calendar.getInstance();

        // Formatter
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());

        // getTime()
        Date date = calendar.getTime();
        System.out.println("Date from Calendar: " + formatter.format(date));

        // Java.util.Date and Calendar compatibility
        Calendar calendarFromDate = Calendar.getInstance();
        calendarFromDate.setTime(date);
        System.out.println("Calendar from Date: " + formatter.format(calendarFromDate.getTime()));

        // .after, .before, .equals
        Calendar future = Calendar.getInstance();
        future.add(Calendar.DAY_OF_YEAR, 1);
        Date futureDate = future.getTime();

        System.out.println("Is date after futureDate? " + date.after(futureDate));
        System.out.println("Is date before futureDate? " + date.before(futureDate));
        System.out.println("Is date equals futureDate? " + date.equals(futureDate));

        // .set()
        Calendar customDate = Calendar.getInstance();
        customDate.set(2024, Calendar.JANUARY, 15); // year, month, day of month
        System.out.println("Custom date: " + formatter.format(customDate.getTime()));

        // .get()
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH); // Month is 0-indexed
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("Year: " + year + ", Month: " + (month + 1) + ", Day: " + day);

        // .parse()
        String dateString = "2023-12-31 23:59:59";
        try {
            Date parsedDate = formatter.parse(dateString);
            System.out.println("Parsed date: " + formatter.format(parsedDate));
        } catch (ParseException e) {
            System.out.println("Error parsing date: " + e.getMessage());
        }
    }
}
/*
 * breakdown:
 * 1. **Calendar Instance:** We obtain an instance of the `Calendar` class using
 * `Calendar.getInstance()`.
 * 2. **Formatter:** `SimpleDateFormat` is used to format and parse dates.
 * 3. **getTime():** Converts the `Calendar` object to a `Date` object.
 * 4. **Compatibility:** Shows how to create a `Calendar` object from a `Date`
 * object using `calendar.setTime(date)`.
 * 5. **.after, .before, .equals:** Demonstrates how to compare `Date` objects.
 * 6. **.set():** Sets specific date and time fields in a `Calendar` object.
 * 7. **.get():** Retrieves specific date and time fields from a `Calendar`
 * object.
 * 8. **.parse():** Parses a date string to create a `Date` object.
 */


