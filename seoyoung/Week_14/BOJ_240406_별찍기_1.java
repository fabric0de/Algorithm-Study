package seoyoung.Week_14;

import java.util.Scanner;

public class BOJ_240406_별찍기_1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int starCount = scanner.nextInt();

    for(int i=1; i<=starCount; i++) {
      for(int j=0; j<i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
