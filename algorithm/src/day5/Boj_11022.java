package day5;

import java.io.*;
import java.util.StringTokenizer;

public class Boj_11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(bf.readLine());

        for(int i=1; i<=n; i++) {
            st = new StringTokenizer(bf.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int sum = a+b;

            bw.write("Case #" + i + ": " + a + " + " + b + " = " + sum + "\n");
        }

        bw.flush();
        bw.close();
    }
}
