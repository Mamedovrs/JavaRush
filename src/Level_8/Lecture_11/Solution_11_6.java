package Level_8.Lecture_11;

import java.util.ArrayList;

public class Solution_11_6 {
    public static void main(String[] args) {
        ArrayList<Human> nochilds = new ArrayList<>();
        Human child1 = new Human("ch1", true, 5, nochilds);
        Human child2 = new Human("ch2", true, 5, nochilds);
        Human child3 = new Human("ch3", true, 5, nochilds);
        ArrayList<Human> childs = new ArrayList<>();
        childs.add(child1);
        childs.add(child2);
        childs.add(child3);
        Human ma = new Human("ma", false, 40, childs);
        Human pa = new Human("pa", true, 40, childs);
        ArrayList<Human> lpa = new ArrayList<>();
        lpa.add(pa);
        ArrayList<Human> lma = new ArrayList<>();
        lma.add(ma);
        Human grandpa1 = new Human("Mike", true, 86, lma);
        Human grandpa2 = new Human("Mike", true, 86, lpa);
        Human grandma1 = new Human("July", false, 86, lma);
        Human grandma2 = new Human("July", false, 86, lpa);

        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
        System.out.println(grandma1.toString());
        System.out.println(grandpa1.toString());
        System.out.println(grandma2.toString());
        System.out.println(grandpa2.toString());
        System.out.println(pa.toString());
        System.out.println(ma.toString());
    }



    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}

