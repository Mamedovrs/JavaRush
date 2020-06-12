package Level_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_4_9 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float t = Float.parseFloat(reader.readLine());
        String color;
        if (t % 5.0 < 3.0)
            color = "зелёный";
        else if (t % 5.0 < 4.0)
            color = "жёлтый";
        else
            color = "красный";
        System.out.println(color);
    }
}
