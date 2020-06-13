package Level_9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution_9_11_3 {
    public static void main(String[] args) {
        readData();
    }
    public static void readData() {
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            try { numbers.add(Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine())); }
            catch (Exception e) { break; }
        }
        for (int number : numbers) { System.out.println(number);}
    }
}
