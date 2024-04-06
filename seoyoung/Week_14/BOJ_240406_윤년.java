package seoyoung.Week_14;

import java.util.Scanner;

//& : 두 조건을 무조건 검사
//&& : 첫번째 조건이 참일때만 검사
public class BOJ_240406_윤년 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int year = scanner.nextInt();

    if (year % 4 == 0 && year % 100 != 0) {
      System.out.println(1);
    } else if (year% 400 ==0) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }
  }
}
