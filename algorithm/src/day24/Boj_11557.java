package day24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_11557 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String ans = "";
        int max = 0;

        for(int i=0; i<n; i++) {
            int cnt = Integer.parseInt(br.readLine());

            for(int j=0; j<cnt; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                String s = st.nextToken();
                int k = Integer.parseInt(st.nextToken());

                if(k > max) {
                    max = k;
                    ans = s;
                }
            }
            System.out.println(ans);
        }
    }
}
