package day5;

import java.util.Scanner;

public class Boj_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int max = 0;
        int count = 0;

        for(int i=0; i<9; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] > max) {
                count=i+1;
                max = arr[i];
            }
        }

        System.out.println(max);
        System.out.println(count);

    }
}
