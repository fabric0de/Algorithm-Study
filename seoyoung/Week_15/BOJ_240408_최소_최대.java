package seoyoung.Week_15;

import java.util.Scanner;

public class BOJ_240408_최소_최대 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int first = scanner.nextInt();
        int min =first;
        int max =first;
        for (int i=1; i<n; i++){
            int num = scanner.nextInt();

            if (min > num) {
                min = num;
            }

            if (max < num) {
                max = num;
            }
        }
        System.out.println(min+" "+max);
    }
}
