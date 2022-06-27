package day16;

import java.util.Scanner;

public class Boj_4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(a==0 && b==0 && c==0) {
                break;
            }

            if(a > b && a > c) {
                if(b*b + c*c == a*a) {
                    System.out.println("right");
                }
                else {
                    System.out.println("wrong");
                }
            }
            else if(b > a && b > c) {
                if(a*a + c*c == b*b) {
                    System.out.println("right");
                }
                else {
                    System.out.println("wrong");
                }
            }
            else {
                if(a*a + b*b == c*c) {
                    System.out.println("right");
                }
                else {
                    System.out.println("wrong");
                }
            }
        }
    }
}
