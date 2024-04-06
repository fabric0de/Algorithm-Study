package seoyoung.Week_14;

import java.util.Scanner;

public class BOJ_240406_코딩은_체육과목_입니다 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    scanner.close();

    for (int i=0; i<(num/4); i++) {
      System.out.print("long ");
    }
    System.out.println("int");
  }
}
