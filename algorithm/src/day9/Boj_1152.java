package day9;

import java.io.*;
import java.util.*;

public class Boj_1152 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        s = s.trim();

        StringTokenizer st = new StringTokenizer(s);

        System.out.println(st.countTokens());
    }
}
