package day16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_5543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int min = 2000;
        int min2 = 2000;
        int[] arr = new int[5];

        for(int i=0; i<5; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i=0; i<5; i++) {
            if (i<3) {
                if(arr[i] < min) {
                    min = arr[i];
                }
            }
            else {
                if(arr[i] < min2) {
                    min2 = arr[i];
                }
            }
        }
        System.out.println((min+min2)-50);
    }
}
