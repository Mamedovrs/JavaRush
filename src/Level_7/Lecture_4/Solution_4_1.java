package Level_7.Lecture_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_4_1 {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++)
            array[i] = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        return array;
    }

    public static int max(int[] array) {
        int max_number = array[0];
        for (int i : array) {
            if (i > max_number)
                max_number = i;
        }
        return max_number;
    }
}
