package seoyoung.Week_14;

import java.util.Scanner;

public class BOJ_240406_영수증 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int totalPrice = scanner.nextInt();
    int loopNum = scanner.nextInt();

    int result = 0;
    for(int i=0; i < loopNum; i++) {
      int price = scanner.nextInt();
      int count = scanner.nextInt();
      result += price * count;
    }

    if (totalPrice == result) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
