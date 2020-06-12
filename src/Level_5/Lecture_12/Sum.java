package Level_5.Lecture_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sum {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String s = "empty";
        int number = 0;
        while (true){
            s = buffer.readLine();
            if (!s.equals("сумма"))
                number += Integer.parseInt(s);
            else
                break;
        }
        System.out.println(number);
    }
}
