package Level_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_6_3 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float a = Float.parseFloat(reader.readLine());
        float b = Float.parseFloat(reader.readLine());
        float c = Float.parseFloat(reader.readLine());
        float min, med, max;
        max = max_3(a, b, c);
        min = min_3(a, b, c);
        med = min_3((max(a,b)), (max(b,c)), (max(a,c)));
        System.out.print(max + " " + med + " " + min);

    }

    public static float max_3(float a, float b, float c){
        if (max(a,b) > max(a,c))
            return max(a,b);
        else
            return max(a,c);
    }

    public static float max(float a, float b){
        if (a > b)
            return a;
        else
            return b;
    }

    public static float min_3(float a, float b, float c){
        if (min(a,b) < min(a,c))
            return min(a,b);
        else
            return min(a,c);
    }

    public static float min(float a, float b){
        if (a < b)
            return a;
        else
            return b;
    }
}
