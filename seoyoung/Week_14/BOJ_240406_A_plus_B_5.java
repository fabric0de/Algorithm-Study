package seoyoung.Week_14;

import java.util.Scanner;

public class BOJ_240406_A_plus_B_5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      int a = scanner.nextInt();
      int b = scanner.nextInt();

      if (a==0 && b==0) {
        break;
      }
      System.out.println(a+b);
    }
  }
}
