package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateUtils {

    static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    static DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
    static Calendar cal = Calendar.getInstance();

    public static String getCurrentDate() {
        return dateFormat.format(cal.getTime());
    }

    public static String getCurrentTime() {
        return timeFormat.format(cal.getTime());
    }
}
