package Level_7.Lecture_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution_9_5 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            list.add(new BufferedReader(new InputStreamReader(System.in)).readLine());
        }
        ArrayList<String> result = doubleValues(list);
        for (String s: result){System.out.println(s);}
    }
    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        ArrayList<String> list_new = new ArrayList<>();
        for (String s: list){ list_new.add(s); list_new.add(s);}
        return list_new;
    }
}
