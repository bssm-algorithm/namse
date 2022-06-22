package day12;

import java.util.*;

public class Boj_2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        sb.append(sc.next()).reverse();
        int a = Integer.parseInt(String.valueOf(sb));

        sb2.append(sc.next()).reverse();
        int b = Integer.parseInt(String.valueOf(sb2));

        int i = a > b ? a : b;
        System.out.println(i);
    }
}
