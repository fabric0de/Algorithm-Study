package seoyoung.Week_14;

import java.util.Scanner;

public class BOJ_240406_사분면_고르기 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int x = scanner.nextInt();
    int y = scanner.nextInt();

    if (x > 0) {
      if (y > 0) {
        System.out.println(1);
      }
      if (y < 0) {
        System.out.println(4);
      }
    }
    if (x < 0) {
      if (y > 0) {
        System.out.println(2);
      }
      if (y < 0) {
        System.out.println(3);
      }
    }
  }
}
