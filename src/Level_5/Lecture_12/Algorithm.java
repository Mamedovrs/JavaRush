package Level_5.Lecture_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm {
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in)).readLine()));
        if (N > 0){
            int i = N;
            int x = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in)).readLine()));
            while (i > 1){
                int y = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in)).readLine()));
                if (y >= x) {x = y;}
                i --;
            }
            System.out.println(x);
        }
    }
}
