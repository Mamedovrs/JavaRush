package Level_9;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution_9_11_12 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }
    public static void sort(String[] array) {
        for (int n = 0; n < array.length; n++) {
            for (int m = n + 1; m < array.length; m++) {
                if (isNumber(array[n]) & isNumber(array[m])) {
                    if (Integer.parseInt(array[n]) < Integer.parseInt(array[m])) {
                        array[n] = array[n] + array[m];
                        array[m] = array[n].substring(0, (array[n].length() - array[m].length()));
                        array[n] = array[n].substring(array[m].length());
                    }
                }

                else if (!isNumber(array[n]) & !isNumber(array[m])) {
                    if (isGreaterThan(array[n], array[m])) {
                        array[n] = array[n] + array[m];
                        array[m] = array[n].substring(0, (array[n].length() - array[m].length()));
                        array[n] = array[n].substring(array[m].length());
                    }
                }
            }
        }
    }
    // Метод для сравнения строк: 'а' больше чем 'b'

    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            { return false; }
        }
        return true;
    }
}


