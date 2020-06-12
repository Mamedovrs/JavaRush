package Level_7.Lecture_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_4_3 {

    public static void main(String[] args) throws Exception {
        int[] numbers = new int[10];
        String[] strings = new String[10];

        for (int i = 0; i < 10; i++){
            strings[i] = (new BufferedReader(new InputStreamReader(System.in))).readLine();
            numbers[i] = strings[i].length();
        }

        for (int i: numbers) System.out.println(i);
    }
}
