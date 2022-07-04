package day23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_10102 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int acnt = 0;
        int bcnt = 0;

            String s = br.readLine();

            if(s.length() == n) {
                for(int j=0; j<s.length(); j++) {
                    if(s.charAt(j) == 'A') {
                        acnt++;
                    }
                    else if(s.charAt(j) == 'B') {
                        bcnt++;
                    }
                }
            }
        if(acnt>bcnt) {
            System.out.println("A");
        }
        else if(acnt<bcnt) {
            System.out.println("B");
        }
        else {
            System.out.println("Tie");
        }
    }
}
