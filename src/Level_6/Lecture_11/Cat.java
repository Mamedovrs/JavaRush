package Level_6.Lecture_11;

import java.util.ArrayList;

public class Cat {
    public static ArrayList<Cat> cats = new ArrayList<>();

    public Cat(){
    }

    public static void printCats(){
        cats.forEach(System.out::println);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            Cat cat = new Cat();
            cats.add(cat);
        }
        printCats();
    }
}
