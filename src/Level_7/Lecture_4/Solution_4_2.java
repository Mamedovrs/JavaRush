package Level_7.Lecture_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_4_2 {
    public static void main(String[] args) throws Exception {
        String[] array = new String[10];
        for (int i = 0; i < 8; i++){
            array[i] = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        }

        for (int j = 9; j >= 0; j--){
            System.out.println(array[j]);
        }

    }
}
