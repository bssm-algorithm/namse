package day18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2455 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = 0;
        int max = 0;

        for(int i=0; i<4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int out = Integer.parseInt(st.nextToken());
            int in = Integer.parseInt(st.nextToken());

            if(out > 0) {
                t -= out;
                t += in;
            }
            else {
                t += in;
            }

            if(t > max) {
                max = t;
            }
        }
        System.out.println(max);
    }
}
