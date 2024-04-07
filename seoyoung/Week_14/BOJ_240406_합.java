package seoyoung.Week_14;

import java.util.Scanner;

public class BOJ_240406_합 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    scanner.close();

    int result = 0;
    for (int i=1; i<=num; i++){
      result += i;
    }

    System.out.println(result);
  }
}
