package Level_6.Lecture_8;

public class Solution_8_4 {
    public static void main(String[] args) {

    }

    public static double getDistance(int x1, int y1, int x2, int y2){
       double d = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
       return d;
    }
}
