package day05;

import java.util.Scanner;

public class Boj_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        double[] pr = new double[n];
        double max=0;
        double sum = 0;

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        for(int i=0; i<n; i++) {
            pr[i] = (arr[i]/max)*100;
            sum += pr[i];
        }

        System.out.println(sum/n);
    }
}
