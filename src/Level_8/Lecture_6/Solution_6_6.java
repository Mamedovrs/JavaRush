package Level_8.Lecture_6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution_6_6 {
    public static void main(String[] args) throws Exception {
        List<Integer> list = new ArrayList<>();
        list.add(Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine()));
        int num = 1;
        int max_num = 1;
        for (int i = 0; i < 9; i++) {
            list.add(Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine()));
            if (list.get(i).equals(list.get(i + 1))){
                num++;
                if (num > max_num)
                    max_num = num;
            }
            else
                num = 1;
            }
        System.out.println(max_num);
    }
}
