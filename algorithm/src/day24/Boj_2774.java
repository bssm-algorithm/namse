package day24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2774 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < t; i++) {
            String x = br.readLine();

            if(x.length() == 1) {
                System.out.println(1);
                continue;
            }
            boolean[] arr = new boolean[1000000];

            for (int j = 0; j < x.length(); j++) {
                int firm = x.charAt(j) - '0';
                if (arr[firm] == false) {
                    arr[firm] = true;
                    cnt++;
                }
            }
            System.out.println(cnt);
            cnt = 0;
        }
    }
}
