package day24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Boj_5363 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            String s = br.readLine();
            List<String> list = new ArrayList<>(Arrays.asList(s.split(" ")));

            for(int j=0; j<2; j++) {
                list.add(list.get(0));
                list.remove(list.get(0));
            }

            list.stream().forEach(p -> System.out.print(p + " "));
        }
    }
}
