package day04;

import java.io.*;
import java.util.StringTokenizer;
//이거는 답 보고 적음.. io 너무 어렵다
public class Boj_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());


        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
        }

        bw.flush();
        bw.close();
    }
}
