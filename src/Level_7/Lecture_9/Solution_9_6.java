package Level_7.Lecture_9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution_9_6 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        String s = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        list.add(s);
        for (int i = 1; i < 10; i++){
            s = (new BufferedReader(new InputStreamReader(System.in))).readLine();
            list.add(s);
            if (list.get(i).length() < list.get(i-1).length()){
                    System.out.println(i);
                    break;
            }

        }
    }
}
