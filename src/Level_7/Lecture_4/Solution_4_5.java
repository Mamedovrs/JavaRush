package Level_7.Lecture_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_4_5 {
    public static void main(String[] args) throws Exception{
        int[] numbers = new int[20];
        int[] numbers1 = new int[10];
        int[] numbers2 = new int[10];

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++){
            numbers[i] = (Integer.parseInt(bf.readLine()));
            if (i<10)
                numbers1[i] = numbers[i];
            else
                numbers2[i-10] = numbers[i];
        }

        for (int i: numbers2){
            System.out.println(i);
        }
    }
}
