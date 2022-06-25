package day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Boj_10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        List<Character> list = new ArrayList<>();
        char c = 'a';

        for(int i=0; i<s.length(); i++) {
            list.add(s.charAt(i));
        }

        for(int j=0; j<=25; j++) {
                System.out.print(Collections.frequency(list, c) + " ");
                c++;
        }
    }
}
