package Level_7.Lecture_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_4_6 {
    public static void main(String[] args) throws Exception{
        int[] numbers = new int[15];
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 15; i++){
            numbers[i] = (Integer.parseInt(bf.readLine()));
        }

        int a = 0;
        int b = 0;

        for (int i = 0; i < numbers.length; i++){
            if (i % 2 == 0)
                a += numbers[i];
            else
                b += numbers[i];
        }

        if (a > b)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
