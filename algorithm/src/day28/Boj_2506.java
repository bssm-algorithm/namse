package day28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int cnt = 0;
        int ans = 0;

        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 0) {
                cnt = 0;
            }
            else if(arr[i] == 1) {
                cnt++;
                ans += cnt;
            }
        }
        System.out.println(ans);
    }
}
