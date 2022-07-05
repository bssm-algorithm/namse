package day24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_3059 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        int[] cnt = new int[26];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();

            for (int j = 0; j < s.length(); j++) {
                cnt[s.charAt(j) - 'A'] += 1;
            }

            for (int k = 0; k < cnt.length; k++) {
                if (cnt[k] == 0) {
                    sum += k + 'A';
                }
            }
            System.out.println(sum);
            sum = 0;

            for (int l = 0; l < cnt.length; l++) {
                cnt[l] = 0;
            }
        }
    }
}
