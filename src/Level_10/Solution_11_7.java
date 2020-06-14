package Level_10;

import java.util.ArrayList;

public class Solution_11_7 {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        String[] s1 = {"Winter", "Spring", "Summer", "Autumn"};
        String[] s2 = {"Winter", "Autumn"};
        ArrayList[] list = new ArrayList[2];
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("a");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("b");
        list[0] = list1;
        list[1] = list2;
        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}










