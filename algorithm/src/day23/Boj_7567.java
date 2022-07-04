package day23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*      내코드
        1. 너무 이상하게 짬
        일단 맞게 뜸
        String s = br.readLine();
        int sum = 0;
        int cnt = 0;

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(') {
                if(i == 0) {
                    sum += 10;
                }
                else if(cnt == 200) {
                    sum += 10;;
                    cnt = 100;
                }
                else {
                    sum += 5;

                }
                cnt = 100;
            }
            else if(s.charAt(i) == ')') {
                if(i == 0) {
                    sum += 10;
                }
                else if(cnt == 100) {
                    sum += 10;
                    cnt = 200;
                }
                else {
                    sum += 5;
                }

                cnt = 200;
            }
        }
        System.out.println(sum);
 */

public class Boj_7567 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int ans = 10;

        for(int i=1; i<s.length(); i++) {
            if(s.charAt(i) == s.charAt(i-1)) {
                ans += 5;
            }
            else {
                ans += 10;
            }
        }
        System.out.println(ans);
    }
}
