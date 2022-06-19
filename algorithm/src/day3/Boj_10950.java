package day3;

import java.util.Scanner;

public class Boj_10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];

        for(int i=0; i<t; i++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            arr[i] = n1 + n2;
        }

        for(int i=0; i<t; i++) {
            System.out.println(arr[i]);
        }

    }
}
