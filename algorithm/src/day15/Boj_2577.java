package day15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj_2577 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        int mul = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());

        String s = String.valueOf(mul);

        for(int i=0; i<s.length(); i++) {
            arr[s.charAt(i) - 48]++;
        }

        for(int j : arr) {
            System.out.print(arr[j]);
        }

/*
        내코드

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

 */
    }
}
