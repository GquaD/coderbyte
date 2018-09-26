package Easy;

import java.util.Scanner;

public class CheckNums {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(check(s.nextLine(), s.nextLine()));
    }

    public static String check(String one, String two){
        int a = Integer.parseInt(one);
        int b = Integer.parseInt(two);
        if (b > a) return "true";
        else if (a == b) return "-1";
        else return "false";
    }
}
