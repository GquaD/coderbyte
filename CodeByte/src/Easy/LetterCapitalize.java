package Easy;//https://www.coderbyte.com/information/Letter%20Capitalize

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Arrays;
import java.util.Scanner;

public class LetterCapitalize {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(LetterCapitalize2(s.nextLine()));
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
        StringBuilder builder = new StringBuilder();
        String[] words = str.split(" ");
        String temp = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i] != null && words[i].length() != 0) {
                char[] chars = words[i].toCharArray();
                chars[0] = Character.toUpperCase(chars[0]);
                temp = new String(chars);
            } else {
                 temp = words[i];
            }
            builder.append(temp + " ");
        }
        //Stringh result = StringUtils.capitalize(str);
        return builder.delete(builder.length() - 1, builder.length()).toString();

    }


}
