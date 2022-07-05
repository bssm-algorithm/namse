package day24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_5789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            String s = br.readLine();

            if(s.charAt((s.length()/2)-1) == s.charAt(s.length()/2)) {
                System.out.println("Do-it");
            }
            else {
                System.out.println("Do-it-Not");
            }
        }
    }
}
