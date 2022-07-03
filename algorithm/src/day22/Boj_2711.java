package day22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2711 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int ota = Integer.parseInt(st.nextToken());
            String s = st.nextToken();

            s = s.substring(0, ota-1) + s.substring(ota);

            System.out.println(s);
        }
    }
}
