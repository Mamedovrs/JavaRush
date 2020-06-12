package Level_4;

public class Solution_1_1 {

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("Age is: " + person.age);
        person.adjustAge(person.age);
        System.out.println("Adjusted age is: " + person.age);
    }

    public static class Person {
        public int age = 20;

        public void adjustAge(int age) {
            this.age = age + 21;
            System.out.println("Age in adjustAge() is: " + this.age);
        }
    }


}
