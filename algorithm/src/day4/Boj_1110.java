package day4;

import java.util.Scanner;

public class Boj_1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0; //사이클 길이

        int right = 0;
        int left = 0;
        int sum = 0;
        int new_n = 0;
        int i = n;

        while(true) {
            count++;
            right = i%10; //n이 45라면 5, 67이라면 7
            left = i/10;//n이 45라면 4, 67이라면 6
            sum = right + left; //n이 45라면 9, 67이라면 13
            new_n = right*10 + (sum%10);
            i = new_n;
            if(i==n) {
                break;
            }
        }
        System.out.println(count);
    }
}
