package Level_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
Как-то средненько
*/

public class Solution_16_3 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        int b = 0;
        while (a !=-1) {
            a = Integer.parseInt(reader.readLine());
            b += a;
        }
        System.out.println(b);
    }
}





