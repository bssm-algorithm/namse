package day18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2490 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;

        for(int i=0; i<3; i++) {
            String s = br.readLine();

            for(int j=0; j<s.length(); j++) {
                if(s.charAt(j) == '1') {
                    cnt++;
                }
            }
            if(cnt == 1) {
                System.out.println("C");
            }
            else if(cnt == 2) {
                System.out.println("B");
            }
            else if(cnt == 3) {
                System.out.println("A");
            }
            else if(cnt == 4){
                System.out.println("E");
            }
            else {
                System.out.println("D");
            }
            cnt = 0;
        }

    }
}
