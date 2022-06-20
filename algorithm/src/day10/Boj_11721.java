package day10;

import java.util.Scanner;

public class Boj_11721 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int cnt = 1;

        for(int i=0; i<s.length(); i++) {
            System.out.print(s.charAt(i));
            if(cnt%10==0) {
                System.out.println();
            }
            cnt++;
        }
    }
}
