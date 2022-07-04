package day23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_7567 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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
    }
}
