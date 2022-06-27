package day16;

import java.util.Scanner;

public class Boj_10817 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = 0;

        for(int i=0; i<2; i++) {
            if(a>=b && a<=c || a<=b && a>=c) {
                System.out.println(a);
                break;
            }
            else if(b>=c && b<=a || b<=c && b>=a) {
                System.out.println(b);
                break;
            }
            else if(c>=a && c<=b || c<=a && c>=b) {
                System.out.println(c);
                break;
            }
        }
    }
}
