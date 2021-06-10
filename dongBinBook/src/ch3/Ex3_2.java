package ch3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        int first = arr[0];
        int second = arr[1];

        int result = (m / (k+1)) * (first * k + second) + (m % (k+1)) * first;
        System.out.println(result);

    }
}
