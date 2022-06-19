package day2;

import java.util.Scanner;

public class Boj_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        int high_m = 0;
        int high_h = 0;

        if(m<45) {
            high_m = 60 + (m-45);
            if(h==1) {
                high_h = 0;
                System.out.println(high_h + " " + high_m);
            }
            else if(h==0) {
                high_h = 23;
                System.out.println(high_h + " " + high_m);
            }
            else {
                h = h-1;
                System.out.println(h + " " +  high_m);
            }
        }
        else {
            m = m-45;
            System.out.println(h + " " + m);
        }

    }
}
