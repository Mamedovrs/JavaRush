package Level_8.Lecture_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_11_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        String[] list = string.split(" ");
        for (String s: list) {
            int i = 0;
            for(String c: s.split("")){
                if (i == 0)
                    System.out.print(c.toUpperCase());
                else
                    System.out.print(c);
                i++;
            }
            System.out.print(" ");
        }
    }
}
