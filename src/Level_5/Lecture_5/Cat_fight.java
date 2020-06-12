package Level_5.Lecture_5;

public class Cat_fight {
    public static void main(String[] args) {

    Cat cat1 = new Cat("c1",10, 10, 10);
    Cat cat2 = new Cat("c2",9,8,9);
    Cat cat3 = new Cat("c3", 3,3,3);
    System.out.println(cat1.fight(cat2));
    System.out.println(cat2.fight(cat3));
    System.out.println(cat1.fight(cat2));

    }

    public static class Cat {
        public String name;
        public int age;
        public int weight;
        public int strength;

        public Cat(String name, int age, int strength, int weight) {
            this.name = name;
            this.age = age;
            this.strength = strength;
            this.weight = weight;
        }

        public boolean fight(Cat anotherCat){
            int score = 0;
            score += Integer.compare(this.strength, anotherCat.strength);
            score += Integer.compare(this.weight, anotherCat.weight);
            score += Integer.compare(this.age, anotherCat.age);
            return score > 0;

        }
        public static void main(String[] args) {
        }

    }
}
