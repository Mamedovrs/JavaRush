package Level_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_9_11_5_chars {
    public static char [] vowels = new char[]{'а', 'я', 'у', 'ю','и','ы','э','е','о','ё'};
    public static void main(String[] args) throws IOException {
        String sentence = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        for (char c: sentence.toCharArray()){
            if (isVowel(c)) {System.out.print(c + " "); }
        }
        System.out.println();
        for (char c: sentence.toCharArray()){
            if (!isVowel(c) & (c != ' ')) {System.out.print(c + " "); }
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}
