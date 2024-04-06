package seoyoung.Week_14;

import java.util.Scanner;

public class BOJ_240406_주사위_세게 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    scanner.close();

    if (a == b & b == c) {
      System.out.println(10000 + (a*1000));
    } else if (a == b | b == c | c == a) {
      int result = 0;
      if (a == b) {
        result = a;
      } else if (b == c) {
        result = b;
      } else {
        result = c;
      }
      System.out.println(1000 + (result*100));
    } else {
      int result = 0;
      int[] numbers = {a,b,c};
      for (int num : numbers) {
        if (result < num) {
          result = num;
        }
      }
      System.out.println(result*100);
    }
  }
}
