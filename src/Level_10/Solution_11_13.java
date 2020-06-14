package Level_10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_11_13 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[30];
        for (int i = 0; i < 30; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        sort(array);
        System.out.println(array[9]);
        System.out.println(array[10]);
    }
    public static void sort(int[] array) {
        for (int n = array.length - 1; n >= 1; n-- ){
            for (int i = 1; i <= n; i++){
                if (array[i-1] > array[i]) {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                }
            }
        }
    }
}








