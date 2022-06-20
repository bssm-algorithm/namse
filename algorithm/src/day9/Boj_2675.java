package day9;

import java.util.Scanner;

public class Boj_2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            int cnt = sc.nextInt();
            String s = sc.next();
            String[] arr = s.split("");

            for(int j=0; j<arr.length; j++) {
                for(int k=0; k<cnt; k++) {
                    System.out.print(arr[j]);
                }
            }
            System.out.println();
        }
    }
}
