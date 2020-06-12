package Level_4;

public class Solution_4_4 {
    public static void checkSeason(int a){
        if ((a < 3)|(a==12))
            System.out.println("зима");
        else
            if (a < 6)
                System.out.println("весна");
            else
                if (a < 9)
                    System.out.println("лето");
                else
                    System.out.println("осень");
    }

    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }
}
