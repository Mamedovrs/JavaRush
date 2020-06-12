package Level_8.Lecture_11;

import java.util.HashSet;
import java.util.Set;

public class Solution_11_1 {
    public static class Cat{
    }

    public static Set<Cat> createCats(){
        Set<Cat> set = new HashSet<>();
        set.add(new Cat());
        set.add(new Cat());
        set.add(new Cat());
        return set;
    }

    public static void printCats(Set<Cat> set){
        for (Cat cat: set) {System.out.println(cat);}
    }

    public static void main(String[] args){
        Set<Cat> set = createCats();
        Set<Cat> set_copy = new HashSet<>(set);
        int i = 0;
        for (Cat cat: set_copy){
            if (i ==0) set.remove(cat);
            i ++;
        }
        printCats(set);
    }
}
