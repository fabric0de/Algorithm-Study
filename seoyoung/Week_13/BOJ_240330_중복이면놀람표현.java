package seoyoung.Week_13;

import java.util.Scanner;

public class BOJ_240330_중복이면놀람표현 {
  public static void main(String[] args) {
    String[] useIdList = {"joonas","baekjoon"};
    Scanner scanner = new Scanner(System.in);
    String scanId = scanner.nextLine().toLowerCase();

    for (String s : useIdList) {
        if (s.equals(scanId)) {
            System.out.println(scanId + "??!");
            return;
        }
    }

    System.out.println(scanId+" : 사용 가능합니다.");
  }
}
