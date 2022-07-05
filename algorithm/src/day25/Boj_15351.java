package day25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_15351 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            int sum = 0;

            s = s.replace(" ", "");

            for (int j = 0; j < s.length(); j++) {
                sum += (s.charAt(j) - 'A') + 1;
            }

            if (sum == 100) {
                System.out.println("PERFECT LIFE");
            } else {
                System.out.println(sum);
            }
        }
    }
}
