package Level_8.Lecture_3;

import java.util.HashSet;
import java.util.Set;

public class Solution_3_1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("арбуз");
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("дыня");
        set.add("ежевика");
        set.add("женьшень");
        set.add("земляника");
        set.add("ирис");
        set.add("картофель");

        for (String s: set){
            System.out.println(s);
        }
    }
}
