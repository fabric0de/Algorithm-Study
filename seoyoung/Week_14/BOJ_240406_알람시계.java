package seoyoung.Week_14;

import java.text.ParseException;
import java.util.Scanner;

public class BOJ_240406_알람시계 {
  public static void main(String[] args) throws ParseException {
    Scanner scanner = new Scanner(System.in);
    int hour = scanner.nextInt();
    int minute = scanner.nextInt();
    int time = (hour * 60) + minute;

    time -= 45;

    if (time < 0) {
      time = 24*60 + time;
    }

    System.out.println(time/60+" "+time%60);
  }
}
