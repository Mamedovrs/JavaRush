package Level_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Solution_9_11_4 {
    public static void main(String[] args) throws IOException, ParseException {
        String date = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        SimpleDateFormat old_format = new SimpleDateFormat("y-MM-dd");
        SimpleDateFormat new_format = new SimpleDateFormat("MMM dd, y", Locale.ENGLISH);
        Date date1 = old_format.parse(date);
        System.out.println(new_format.format(date1).toUpperCase());
    }
}
