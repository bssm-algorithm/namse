package day12;

import java.util.Scanner;

public class Boj_10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = 'a';

        for(int j=0; j<25; j++) {
            System.out.print(s.indexOf(c) + " ");
            c++;
        }
    }
}
