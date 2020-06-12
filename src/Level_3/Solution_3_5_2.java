package Level_3;

public class Solution_3_5_2 {
    public static int ConvertToSeconds(int hour){
        return (hour*60*60);
    }
    public static void main(String[] args) {
        System.out.println(ConvertToSeconds(1));
        System.out.println(ConvertToSeconds(24));
    }
}
