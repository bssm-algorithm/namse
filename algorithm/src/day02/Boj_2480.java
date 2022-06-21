package day02;

import java.util.Scanner;

public class Boj_2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int r = 0;

        if(a==b && a==c && b==c) {
            r = 10000 + a*1000;
        }
        else if(a==b || a==c || b==c) {
            if(a==b || a==c) {
                r = 1000 + a*100;
            }

            if(b==a || b==c) {
                r = 1000 + b*100;
            }

            if(c==a || c==b) {
                r = 1000 + c*100;
            }
        }
        else {
            if(a>b && a>c) {
                r = a*100;
            }
            else if(b>a && b>c) {
                r = b*100;
            }
            else {
                r = c*100;
            }
        }
        System.out.println(r);
    }
}
