package day14;

import java.util.Scanner;

public class Boj_2798 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = search(arr, n, m);
        System.out.println(result);
    }

    static int search(int[] arr, int n, int m) {
        int ans = 0;

        for(int i=0; i<n-2; i++) {
            for(int j=1; j<n-1; j++) {
                for(int k=2; k<n; k++) {
                    int temp = arr[i] + arr[j] + arr[k];

                    if(temp == m) {
                        return temp;
                    }

                    if(ans < temp && temp < m) {
                        ans = temp;
                    }
                }
            }
        }

        return ans;
    }
}
