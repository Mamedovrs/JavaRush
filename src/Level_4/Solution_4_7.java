package Level_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_4_7 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int x = 365;
        if ((a % 400 == 0) | ((a % 100 != 0) & (a % 4 == 0)))
            x = 366;
        System.out.println("количество дней в году: " + x);
    }
}
