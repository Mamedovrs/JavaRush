package Level_8.Lecture_8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution_8_6 {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++){
            map.put("family"+i, 499+i);
        }
        return map;
    }
    public static void removeItemFromMap(Map<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> si = map.entrySet().iterator();
        while (si.hasNext()){
            if (si.next().getValue() < 500)
                si.remove();
        }
    }
    public static void main(String[] args) {
    }
}
