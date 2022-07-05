package day24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_11170 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int cnt = 0;
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            for (int j = n; j <= m; j++) {
                String s = String.valueOf(j);

                for (int k = 0; k < s.length(); k++) {
                    if (s.charAt(k) == '0') {
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}
