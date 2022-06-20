package day9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Boj_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = new String();
        List<Integer> list = new ArrayList<>();
        int sum = 0;

        for(int i=0; i<n; i++) {
            s = sc.next();

            for(int j=0; j<s.length(); j++) {
                list.add(Integer.parseInt(String.valueOf(s.charAt(j))));

                sum += list.get(j);
            }
            System.out.println(sum);
            break;
        }

    }
}
