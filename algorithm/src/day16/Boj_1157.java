package day16;

import java.util.*;

public class Boj_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.toLowerCase();
        int max = 0;
        char ans = 'A';

        int[] count = new int[26];

        for(int i=0; i<s.length(); i++) {
            count[s.charAt(i) - 'a'] += 1;
        }

        for(int j=0; j<count.length; j++) {
            if(count[j] > max) {
                max = count[j];
                ans = (char) (j+65);
            }
            else if(count[j] == max) {
                ans = '?';
            }
        }
        System.out.println(ans);
    }
}
