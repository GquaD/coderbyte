package Easy;//https://coderbyte.com/information/Time%20Convert

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Scanner;

public class TimeConvert {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(timeConv(s.nextInt()));
    }

    public static String timeConv(int time){
        return (time / 60) + ":" + (time % 60);
    }
}
