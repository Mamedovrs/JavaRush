package Level_10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Solution_11_5 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        for (char c: alphabet) {
            int counter = 0;
            for (String s: list){
                for (char ch: s.toCharArray()) {
                    if (c == ch) { counter++; }
                }
            }
            System.out.println(c + " " + counter);
        }
    }
}





