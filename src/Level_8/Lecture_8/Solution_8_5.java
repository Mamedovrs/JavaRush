package Level_8.Lecture_8;

import java.util.HashMap;
import java.util.Map;

public class Solution_8_5 {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++){
            map.put("family"+i, "name"+i);
        }
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (getCountTheSameFirstName(map, pair.getValue()) > 1)
                removeItemFromMapByValue(map, pair.getValue());
        }
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

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
    }
}
