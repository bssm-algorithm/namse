package day16;

import java.io.*;

public class Boj_10039 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int ans = 0;

        for(int i=0; i<5; i++) {
            int n = Integer.parseInt(br.readLine());

            if (n < 40){
                n = 40;
            }

            ans += n;
        }

        bw.write(Integer.toString(ans/5));
        bw.flush();
        bw.close();
    }
}
