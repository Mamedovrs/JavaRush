package Level_7.Lecture_6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution_6_6 {

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<String>();
        int len_max_str = 0;
        int len_min_str = 0;

        for (int i = 0; i < 10; i++){
            strings.add(bf.readLine());
            if (i == 0)
                len_min_str = strings.get(i).length();
            if (strings.get(i).length() > len_max_str)
                len_max_str = strings.get(i).length();
            if (strings.get(i).length() < len_min_str)
                len_min_str = strings.get(i).length();
        }

        for (String s: strings) {
            if (s.length() == len_max_str || s.length() == len_min_str) {
                System.out.println(s);
                break;
            }
        }
    }
}



