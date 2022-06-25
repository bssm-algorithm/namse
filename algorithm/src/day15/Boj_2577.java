package day15;

import java.util.*;

public class Boj_2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int mul = a*b*c;
        String s = String.valueOf(mul);
        List<Integer> number = new ArrayList<>();

        for(int k=0; k<s.length(); k++) {
            number.add(Integer.parseInt(String.valueOf(s.charAt(k))));
        }

        for(int i=0; i<=9; i++) {
                    System.out.println(Collections.frequency(number, i));
        }
    }
}
