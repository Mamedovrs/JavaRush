package Level_5.Lecture_12;

public class People {
    public static class Man{
        String name;
        int age;
        String address;

        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman{
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static void main(String[] args) {
        Man man1 = new Man("Carlos", 18, "Moscow");
        Man man2 = new Man("Hulio", 28, "Moscow");
        Woman woman1 = new Woman("Carlos", 18, "Moscow");
        Woman woman2 = new Woman("Hulio", 28, "Moscow");

        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
    }


}
