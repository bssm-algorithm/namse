package day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Boj_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<n; i++) {
            list.add(sc.nextInt());
        }

        System.out.println(Collections.min(list) + " " + Collections.max(list));
    }
}

