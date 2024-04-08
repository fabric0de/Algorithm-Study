package seoyoung.Week_15;

import java.util.Scanner;

public class BOJ_240408_최댓값 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int max =first;
        int num = 1;
        for (int i=1; i<9; i++){
            int value = scanner.nextInt();
            if (max < value) {
                max = value;
                num = i+1;
            }
        }
        System.out.println(max+" "+num);
    }
}
