package day2;

import java.util.Scanner;

public class Boj_1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b) {
            System.out.println(">");
        }
        if(b>a) {
            System.out.println("<");
        }
        if(a==b) {
            System.out.println("==");
        }
    }
}
