package day24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj_5045 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++) {
            int n = Integer.parseInt(br.readLine());
            List<Integer> list = new ArrayList<>();
            int sum = 0;

            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s, " ");
            for(int j=0; j<n; j++) {
                list.add(Integer.parseInt(st.nextToken()));
            }
            Collections.sort(list);

            for(int k=0; k<list.size()-1; k++) {
                sum += list.get(k+1) - list.get(k);
            }
            System.out.println(sum*2);
        }
    }
}
