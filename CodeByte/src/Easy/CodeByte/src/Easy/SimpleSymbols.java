package Easy;//https://coderbyte.com/editor/Simple%20Symbols:Java

import java.util.Scanner;

public class SimpleSymbols {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(SimpleSymbols1(s.nextLine()));
    }

    public static String SimpleSymbols(String str) {
        char[] simbols = str.toCharArray();
        String result = "";
        int count = 0;
        for (int i = 1; i < simbols.length - 1; i++) {
            if (Character.toString(simbols[i]).matches("[a-z]") && simbols[i - 1] == '+' && simbols[i + 1] == '+') {
                result = "true";
            } else {
                result = "false";
                count++;
            }
        }
        return count > 0 ? "false" : "true";
    }

    public static String SimpleSymbols1(String str) {
        char[] simbols = str.toCharArray();
        String result = "";
        int countLetter = 0, countTrue = 0;

        if (Character.toString(simbols[0]).matches("[a-z]")) {
            countLetter++;
        }

        if (Character.toString(simbols[simbols.length - 1]).matches("[a-z]")) {
            countLetter++;
        }

        for (int i = 1; i < simbols.length - 1; i++) {
            if (Character.toString(simbols[i]).matches("[a-z]")) {
                countLetter++;
                if (simbols[i - 1] == '+' && simbols[i + 1] == '+') {
                    countTrue++;
                }
            }
        }
        return countLetter == countTrue ? "true" : "false";
    }
}
