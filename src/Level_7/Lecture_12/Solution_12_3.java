package Level_7.Lecture_12;

import java.util.ArrayList;

public class Solution_12_3 {

    public static void main(String[] args) {
    Human grandpa1 = new Human("Вася", true,86 );
    Human grandpa2 = new Human("Миша", true,76 );
    Human grandma1 = new Human("Лена", false,86 );
    Human grandma2 = new Human("Ира", false,76 );
    Human father = new Human("Саша", true, 55, grandpa1, grandma1);
    Human mother = new Human("Маша", false, 45, grandpa2, grandma2);
    Human daughter = new Human("Лена", false, 15, father, mother);
    Human son1 = new Human("Гена", true, 15, father, mother);
    Human son2 = new Human("Вася", true, 15, father, mother);

    //for (Human h: father.family){
    //    System.out.println(h);
    //}

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;
        public static ArrayList<Human> family = new ArrayList<Human>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            family.add(this);
            System.out.println(this);
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
            family.add(this);
            System.out.println(this);
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }

    }
}