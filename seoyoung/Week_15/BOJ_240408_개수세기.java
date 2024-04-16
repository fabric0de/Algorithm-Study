package seoyoung.Week_15;

import java.util.Scanner;

public class BOJ_240408_개수세기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];

        for(int i=0; i<N;i++) {
            arr[i] = scanner.nextInt();
        }
        int v = scanner.nextInt();

        int result = 0;
        for(int i=0; i<N;i++) {
            if (v == arr[i]) {
                result++;
            }
        }

        System.out.println(result);

    }
}
