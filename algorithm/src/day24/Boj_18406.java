package day24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class Boj_18406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int sum = 0;
        int sum2 = 0;

        String a = s.substring(0, s.length() / 2);
        String b = s.substring(s.length() / 2);

        for (int i = 0; i < a.length(); i++) sum += parseInt(String.valueOf(a.charAt(i)));

        for (int i = 0; i < b.length(); i++) sum2 += parseInt(String.valueOf(b.charAt(i)));

        if (sum == sum2) System.out.println("LUCKY");
        else System.out.println("READY");

    }
}
