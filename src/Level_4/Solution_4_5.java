package Level_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_4_5 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        if (a == 0)
            System.out.println(0);
        else if (a < 0)
            System.out.println((a + 1));
        else
            System.out.println((a * 2));
    }

}
