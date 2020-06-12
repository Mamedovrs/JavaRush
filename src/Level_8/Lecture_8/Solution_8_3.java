package Level_8.Lecture_8;

import java.util.*;

public class Solution_8_3 {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("family" + i, "name" + i);
        }
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        if (!map.containsValue(name)) return 0;
        else{
            int i = 0;
            for (String value: map.values()){
                if (value.equals(name)) i++;
            }
            return i;
        }
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        if (!map.containsKey(lastName)) return 0;
        else{
            int i = 0;
            for (String key: map.keySet()){
                if (key.equals(lastName)) i++;
            }
            return i;
        }
    }

    public static void main(String[] args) {
    }
}
