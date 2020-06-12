package Level_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution_5_5 {
    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bf.readLine());
        while (number!=0){
            if (number % 2 == 0) even++;
            else odd++;
            number /= 10;
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }

}
