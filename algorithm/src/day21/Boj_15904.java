package day21;

import java.io.*;

public class Boj_15904 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        char[] arr = {'U', 'C', 'P', 'C'};
        int cnt = 0;

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == arr[cnt]) {
                cnt++;
                if(cnt == 4) {
                    break;
                }
            }
        }

        if(cnt == 4) {
            bw.write("I love UCPC");
        }
        else {
            bw.write("I hate UCPC");
        }
        bw.flush();
        bw.close();
    }
}
