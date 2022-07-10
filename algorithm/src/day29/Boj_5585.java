package day29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_5585 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = {500, 100, 50, 10, 5, 1};
        int cnt = 0;

        n = 1000-n;

        for(int i=0; i<6; i++) {
            cnt += n / arr[i];
            n %= arr[i];
        }

        System.out.println(cnt);
    }
}
