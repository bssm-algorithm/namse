package day18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        int cnt = 0;
        int[] en = new int[26];

        String s = br.readLine();
        String temp = s;

        for(int i=0; i<arr.length; i++) {
            if(s.contains(arr[i])) {
                cnt++;
                s = s.replace(arr[i], "");
                if(s.equals("")) {
                    cnt++;
                }
            }
        }

        for(int i=0; i<26; i++) {
            for(int j=0; j<s.length(); j++) {
                en[s.charAt(j) - 'a'] += 1;
            }
            if(en[i] > 0) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
