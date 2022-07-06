package day25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Boj_25305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>();

        String s = br.readLine();
        st = new StringTokenizer(s, " ");
        for(int i=0; i<n; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(list);
        Collections.reverse(list);

        System.out.println(list.get(k-1));
    }
}
