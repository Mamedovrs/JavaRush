package Level_7.Lecture_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution_12_1 {
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in)).readLine()));
        int M = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in)).readLine()));
        ArrayList<String> s = new ArrayList<>();
        for (int i = N; i > 0; i-- ){
            s.add((new BufferedReader(new InputStreamReader(System.in)).readLine()));
        }
        for (int i = M; i > 0; i-- ){
            s.add(s.get(0));
            s.remove(0);
        }
        for (int i = 0; i < N; i++){
            System.out.println(s.get(i));
        }
    }
}
