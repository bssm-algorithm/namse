package day03;

import java.util.Scanner;

public class Boj_8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        sc.close();
        for(int i=1; i<=n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}