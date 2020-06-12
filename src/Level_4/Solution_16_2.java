package Level_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_16_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int min, med, max;
        med = min_3((max(a, b)), (max(b, c)), (max(a, c)));
        System.out.print(med);
    }

    public static int max(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public static int min_3(int a, int b, int c) {
        if (min(a, b) < min(a, c))
            return min(a, b);
        else
            return min(a, c);
    }

    public static int min(int a, int b) {
        if (a < b)
            return a;
        else
            return b;
    }
}
