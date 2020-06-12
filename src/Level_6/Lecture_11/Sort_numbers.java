package Level_6.Lecture_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Sort_numbers {
    public static void main(String[] args) throws IOException {
        int[] list = new int[5];

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <= 4; i++){
            list[i] = (Integer.parseInt(bf.readLine()));
        }
        Arrays.sort(list);
        for (int i : list){
            System.out.println(i);
        }

    }
}
