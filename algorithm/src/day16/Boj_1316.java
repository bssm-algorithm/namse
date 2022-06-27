package day16;

import java.util.Scanner;

public class Boj_1316 {

    static Scanner sc = new Scanner(System.in);

    static boolean check() {
        String s = sc.next(); //aba
        boolean[] c = new boolean[26];
        int p = 0;

        for(int i=0; i<s.length(); i++) {
            int now = s.charAt(i); //a

            if(p != now) { //0이랑 97(a)랑 다르다면
                if(c[now - 'a'] == false) { //a가 처음 들어온 문자라면
                    c[now - 'a'] = true;
                    p = now;
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int count = 0;

        for(int i=0; i<n; i++) {
            if(check() == true) {
                count++;
            }
        }
        System.out.println(count);
    }
}
