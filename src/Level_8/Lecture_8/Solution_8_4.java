package Level_8.Lecture_8;

import java.text.*;
import java.util.*;

public class Solution_8_4 {
        public static Map<String, Date> createMap() throws ParseException {
            DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
            Map<String, Date> map = new HashMap<>();
            map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
            for (int i = 0; i < 9; i++){
                map.put("family" + i, dateFormat.parse("JULY 4 " + 2000 + i));
            }
            return map;
        }

        public static void removeAllSummerPeople(Map<String, Date> map) {
            Iterator<Map.Entry<String, Date>> it = map.entrySet().iterator();
            while (it.hasNext()){
                Date val = it.next().getValue();
                if (val.getMonth() >= 5 && val.getMonth() <= 7)
                    it.remove();
            }
        }

        public static void main(String[] args) throws ParseException {
        }
}
