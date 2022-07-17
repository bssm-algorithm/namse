package day31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int f = Integer.parseInt(br.readLine());

        int cnt = 0;
        for(int v : arr) {
            if(v == f) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
