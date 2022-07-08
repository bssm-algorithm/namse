package day27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_5585 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for(int i=0; i<n; i++) {
            int m = Integer.parseInt(br.readLine());
            if(m == 1) {
                cnt++;
            }
            else {
                cnt--;
            }
        }
        if(cnt > 0) {
            System.out.println("Junhee is cute!");
        }
        else {
            System.out.println("Junhee is not cute!");
        }
    }
}
