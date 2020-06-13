package Level_9;

public class Solution_11_6 {
    public static void main(String[] args) {
    }

    public static class Human {
        private String p1, p2, p3, p4, p5;
        private int p6;

        public Human(String p1){
            this.p1 = p1;
        }
        public Human(String p1, String p2){
            this.p1 = p1;
            this.p2 = p2;
        }
        public Human(String p1, String p2, String p3){
            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
        }
        public Human(String p1, String p2, String p3, String p4){
            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
            this.p4 = p4;
        }
        public Human(String p1, String p2, String p3, String p4, String p5){
            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
            this.p4 = p4;
            this.p5 = p5;
        }
        public Human(String p1, String p2, String p3, String p4, String p5, int p6){
            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
            this.p4 = p4;
            this.p5 = p5;
            this.p6 = p6;
        }

        public Human(int p6){
            this.p6 = p6;
        }
        public Human(String p1, int p6){
            this.p1 = p1;
            this.p6 = p6;
        }
        public Human(String p1, String p2, int p6){
            this.p1 = p1;
            this.p2 = p2;
            this.p6 = p6;
        }
        public Human(String p1, String p2, String p3, int p6){
            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
            this.p6 = p6;
        }
    }
}
