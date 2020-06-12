package Level_7.Lecture_6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution_6_2 {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<String>();
        int len_string = 0;
        for (int i = 0; i < 5; i++){
            strings.add(bf.readLine());
            if (strings.get(i).length() >= len_string)
                    len_string = strings.get(i).length();
        }

        for (String s: strings){
            if (s.length() == len_string)
                System.out.println(s);
        }
    }
}
