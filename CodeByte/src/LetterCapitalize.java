//https://www.coderbyte.com/information/Letter%20Capitalize

import java.util.Arrays;
import java.util.Scanner;

public class LetterCapitalize {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(LetterCapitalize1(s.nextLine()));
    }

    public static String LetterCapitalize1(String str){
        StringBuilder result = new StringBuilder(str);
        String[] strings = str.split(" ");
        for (int i = 0; i < strings.length; i++) {
            String temp = strings[i];
            //if (!(Character.toString(temp.charAt(0)).matches("[A-Z]"))){
                temp.replace(temp.charAt(0), ((char)(temp.charAt(0) - 32)));
            //}
            result.append(temp);
        }
        return result.toString();
    }

    public static String LetterCapitalize2(String str){
        StringBuilder result = new StringBuilder("");

       char[] chars = str.toCharArray();
        return str;

    }
}
