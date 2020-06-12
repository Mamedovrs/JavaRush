package Level_4;

public class Solution_4_2 {
    public static void displayClosesToTen(int a, int b){
        if (abs((10-a))>abs((10-b)))
            System.out.println(b);
        else
            System.out.println(a);
    }

    public static int abs(int a){
        if (a < 0)
            return -a;
        else
            return a;
    }

    public static void main(String[] args) {
        displayClosesToTen(8, 11);
        displayClosesToTen(7, 14);
    }
}
