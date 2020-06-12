package Level_8.Lecture_11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Solution_11_7_calendar {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("MAY 1 2000"));
    }
    public static boolean isDateOdd(String date) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("MMMM d y", Locale.ENGLISH);
        Date date1 = format.parse(date);
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date1);
        return calendar.get(Calendar.DAY_OF_YEAR) % 2 != 0;
    }
}
