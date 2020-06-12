package Level_7.Lecture_9;

import java.util.ArrayList;

public class Solution_9_4 {
    public static ArrayList<String> fix(ArrayList<String> list){
        ArrayList<String> list_to_add = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).contains("р") && !list.get(i).contains("л"))
                continue;
            else if (list.get(i).contains("л") && !list.get(i).contains("р"))
                list_to_add.add(list.get(i));
            list_to_add.add(list.get(i));
        }
        return list_to_add;
    }
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("роза");
        list.add("лира");
        list.add("лоза");
        list = fix(list);
        for (String s: list){
            System.out.println(s);
        }
    }
}
