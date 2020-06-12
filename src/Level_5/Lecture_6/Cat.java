package Level_5.Lecture_6;

public class Cat {
    String name = null;
    int weight = 10;
    int age = 1;
    String color = "blue";
    String address = null;

    public void initialize(String name){
        this.name = name;
    }

    public void initialize(String name, int weight, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void initialize(int weight, String color){
        this.color = color;
        this.weight = weight;
    }

    public void initialize(int weight, String color, String address){
        this.color = color;
        this.weight = weight;
        this.address = address;
    }


    public static void main(String[] args) {
    }
}
