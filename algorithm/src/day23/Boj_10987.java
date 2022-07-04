package day23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_10987 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] arr = {'a', 'e', 'i', 'o', 'u'};
        int cnt = 0;

        for(int i=0; i<s.length(); i++) {
            for(int j=0; j<5; j++) {
                if(s.charAt(i) == arr[j]) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
