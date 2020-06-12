package Level_5.Lecture_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Average {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float sum = 0, cnt = 0, num = 0;
        while (num!=-1){
            num = Integer.parseInt(reader.readLine());
            if (num != -1) {
                sum += num;
                cnt++;
            }
        }
        System.out.println(sum/cnt);
    }
}
