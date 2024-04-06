package seoyoung.Week_14;

import java.util.Scanner;

public class BOJ_240406_A_plus_B_4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (scanner.hasNextInt()) {
      int a = scanner.nextInt();
      int b = scanner.nextInt();

      System.out.println(a+b);
    }
    scanner.close();
  }
}
