package Level_5.Lecture_5;

public class Cat {
    public int age;
    public int weight;
    public int strength;

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
