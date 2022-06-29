package day18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_1100 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        int temp = 1;

        for(int i=0; i<8; i++) {
            String s = br.readLine();

            if(i%2==1) {
                for(int j=0; j<8; j++) {
                    if(j%2==1 && s.charAt(j) == 'F') {
                        cnt++;
                    }
                }
            }
            else {
                for(int j=0; j<8; j++) {
                    if(j%2==0 && s.charAt(j) == 'F') {
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
