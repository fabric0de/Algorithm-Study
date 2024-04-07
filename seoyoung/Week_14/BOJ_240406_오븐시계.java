package seoyoung.Week_14;

import java.util.Scanner;

public class BOJ_240406_오븐시계 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int hour = scanner.nextInt();
    int minute = scanner.nextInt();
    int addTime = scanner.nextInt();

    int time = (hour*60) + minute +addTime;

    int h = (time/60) % 24;
    int m = time%60;

    System.out.println(h+" "+m);
  }
}
