package day11;

import java.util.Scanner;

public class Boj_5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] arr = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
        int cnt = 0;

        for(int i=0; i<8; i++) {
            for(int j=0; j<s.length(); j++) {
                if(arr[i].indexOf(s.charAt(j)) != -1) {
                    cnt += 3 + i;
                }
            }
        }
        System.out.println(cnt);
    }
}
