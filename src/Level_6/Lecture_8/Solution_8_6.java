package Level_6.Lecture_8;

public class Solution_8_6 {
    public static void main(String[] args) {
    }

    public static String multiply(String s, int count){
        String result = "";
        for (int i = 0; i < count; i++){
            result += s;
        }
        return result;
    }

    public static String multiply(String s){
        String result = "";
        for (int i = 0; i < 5; i++){
            result += s;
        }
        return result;
    }
}
