package Level_7.Lecture_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution_9_1 {

    public static void printList(ArrayList<Integer> list){
        list.forEach(System.out::println);
    }

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++)
        {
        int x = Integer.parseInt(new BufferedReader
                (new InputStreamReader(System.in)).readLine());
        list.add(x);
        }

        for (int x: list)
        {
            if (x % 3 == 0)
                list3.add(x);
            if (x % 2 == 0)
                list2.add(x);
            if (x % 2 != 0 && x % 3 != 0)
                list1.add(x);
        }

        printList(list3);
        printList(list2);
        printList(list1);

    }
}
