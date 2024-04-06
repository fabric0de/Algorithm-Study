package seoyoung.Week_14;

import java.util.Scanner;

public class BOJ_240406_A_plus_B_3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int loopNum = scanner.nextInt();
    int[] numbers = new int[loopNum*2];
    for(int i=0; i < (loopNum*2); i++) {
      numbers[i] = scanner.nextInt();

      if (i%2 != 0) {
        System.out.println(numbers[i-1] + numbers[i]);
      }
    }
  }
}
