package day02;

import java.util.Scanner;

public class Boj_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int t = sc.nextInt();

        h = h + (m+t) / 60;
        m = (m+t) %60;

        if(h>=24) {
            h -= 24;
        }
        System.out.println(h + " " + m);
    }
}
