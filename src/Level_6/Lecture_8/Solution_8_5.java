package Level_6.Lecture_8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_8_5 {
    public static void main(String[] args) {
    }

    public static String readString() throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        return bf.readLine();
    }

    public static int readInt() throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(bf.readLine());
    }

    public static double readDouble() throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        return Double.parseDouble(bf.readLine());
    }

    public static boolean readBoolean() throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        return Boolean.parseBoolean(bf.readLine());
    }
}
