package seoyoung.Week_14;

import java.util.Scanner;

public class BOJ_240406_A_plus_B_7 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int loopNum = scanner.nextInt();

    for(int i=1; i<=loopNum; i++) {
      int a = scanner.nextInt();
      int b = scanner.nextInt();

      System.out.println("Case #"+i+": "+(a+b));
    }
  }
}
