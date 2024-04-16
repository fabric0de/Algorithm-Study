package seoyoung.Week_15;

import java.util.Scanner;

public class BOJ_240408_X보다_작은_수 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int[] arr = new int[N];

        for (int i=0; i<N; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i=0; i<N; i++) {
            if (arr[i] < X) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
