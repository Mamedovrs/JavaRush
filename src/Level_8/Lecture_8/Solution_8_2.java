package Level_8.Lecture_8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution_8_2 {
    public static void main(String[] args) {
    }

    public static Set<Integer> createSet(){
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 20; i++){set.add(i);}
        return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set){
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            if (iterator.next()>10) iterator.remove();
        }
        return set;
    }
}
