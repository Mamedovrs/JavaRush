package Level_10;


import java.io.*;
import java.util.HashMap;

public class Solution_11_12 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        while (true) {
            try {
                int id = Integer.parseInt(reader.readLine());
                String name = reader.readLine();
                map.put(name, id);
            }
            catch (Exception e){break;}
        }
        map.forEach((key, value) -> System.out.println(value + " " + key));
    }
}
