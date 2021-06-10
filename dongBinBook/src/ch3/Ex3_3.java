package ch3;

import java.util.Scanner;

public class Ex3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int min = 0;

        for (int i = 0; i < n; i++) {
            int min_line = 100001;
            for(int j=0; j < m; j++) {
                int k = sc.nextInt();
                min_line = Math.min(min_line,k);
            }
            min = Math.max(min_line, min);
        }
        System.out.println(min);
    }
}
