package Easy;//https://www.coderbyte.com/language/First%20Reverse

import java.util.Scanner;

public class ReverseChallenge {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(FirstReverse1(s.nextLine()));
    }

    public static String FirstReverse(String str){
        String s = "";
        for (int i = 1; i <= str.length(); i++) {
            s += Character.toString(str.charAt(str.length() - i));
        }
        return s;
    }
    public static String FirstReverse1(String str){
        StringBuilder s = new StringBuilder(str);
        return s.reverse().toString();
    }

}
