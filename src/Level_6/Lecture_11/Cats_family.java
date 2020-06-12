package Level_6.Lecture_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cats_family {

    public static class Cat {
        String name;
        Cat parent1, parent2;

        public Cat(String name){
            this.name = name;
        }

        public Cat (String name, Cat parent1){
            this.name = name;
            this.parent1 = parent1;
        }

        public Cat (String name, Cat parent1, Cat parent2){
            this.name = name;
            this.parent1 = parent1;
            this.parent2 = parent2;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Cat grandpa = new Cat(bf.readLine());
        Cat grandma = new Cat(bf.readLine());
        Cat father = new Cat(bf.readLine(), grandpa);
        Cat mother = new Cat(bf.readLine(), grandma);
        Cat son = new Cat(bf.readLine(), mother, father);
        Cat daughter = new Cat(bf.readLine(), mother, father);
        String tcn = "The cat's name is ";
        System.out.println(tcn + grandpa.name + ", no mother, no father");
        System.out.println(tcn + grandma.name + ", no mother, no father");
        System.out.println(tcn + father.name + ", no mother, father is " + grandpa.name);
        System.out.println(tcn + mother.name + ", mother is " + grandma.name + ", no father");
        System.out.println(tcn + son.name + ", mother is " + mother.name + ", father is " + father.name);
        System.out.println(tcn + daughter.name + ", mother is " + mother.name + ", father is " + father.name);
    }
}
