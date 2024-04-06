package seoyoung.Week_14;

import java.util.Scanner;

public class BOJ_240406_A_plus_B_8 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int T = scanner.nextInt();

    for(int i=1; i<=T; i++) {
      int a = scanner.nextInt();
      int b = scanner.nextInt();

      System.out.println("Case #"+i+": "+a+" + "+b+" = "+(a+b));
    }
  }
}
