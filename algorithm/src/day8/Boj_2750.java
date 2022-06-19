package day8;

import java.util.ArrayList;
import java.util.Scanner;

public class Boj_2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> l = new ArrayList<>();
        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            l.add(sc.nextInt());
        }

        l.stream().sorted().distinct().forEach(p -> System.out.println(p));
    }
}
