package seoyoung.Week_13;

import java.util.Scanner;

public class BOJ_240330_곱셈 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int firstNumber = scanner.nextInt();
    int secondNumber = scanner.nextInt();
    int secondNumber_length = Integer.toString(secondNumber).length();

    int num = secondNumber;
    for(int i=0; i < secondNumber_length; i++) {
      int a = num % 10;
      num = num / 10;
      System.out.println(firstNumber * a);
    }

    System.out.println(firstNumber * secondNumber);
  }
}
