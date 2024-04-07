package seoyoung.Week_14;

import java.util.Scanner;

public class BOJ_240406_두_수_비교하기 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    if (a > b) {
      System.out.println(">");
    } else if (a < b) {
      System.out.println("<");
    } else {
      System.out.println("==");
    }
  }
}
