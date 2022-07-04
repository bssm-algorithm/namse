package day24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] arr = {"C", "A", "M", "B", "R", "I", "D", "G", "E"};

        for(int i=0; i<arr.length; i++) {
            if(s.contains(arr[i]) == true) {
                s = s.replace(arr[i], "");
            }
        }
        System.out.println(s);
    }
}
