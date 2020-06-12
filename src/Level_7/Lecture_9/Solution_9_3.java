package Level_7.Lecture_9;

import java.util.ArrayList;

public class Solution_9_3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");
        list.add(1, "именно");
        list.add(3, "именно");
        list.add(5, "именно");
        for (String s: list) {System.out.println(s); }
    }
}
