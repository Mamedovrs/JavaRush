package Level_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_7_1 {
    public static void main(String[] args) throws Exception {
        int number = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in)).readLine()));
        if ((number >= 1) & (number <= 999)){
            String first_word = "нечетное ";
            if (number % 2 == 0) {first_word = "четное ";}
            String second_word = "трехзначное ";
            if (number < 100) {second_word = "двузначное ";}
            if (number < 10) {second_word = "однозначное ";}
            System.out.println(first_word + second_word + "число");
        }
    }
}
