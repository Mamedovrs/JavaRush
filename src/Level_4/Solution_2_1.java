package Level_4;

public class Solution_2_1 {

    public static /*Джава раш принял решение без указания static */class Cat {
        private String name = "безымянный кот";

        public void setName(String name) {
            this.name = name;
        }

        public static void main(String[] args) {
            Cat cat = new Cat();
            cat.setName("Жужик");
            System.out.println(cat.name);
        }
    }
}
