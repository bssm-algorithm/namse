package day30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Boj_5576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for(int i=0; i<20; i++) {
            int n = Integer.parseInt(br.readLine());
            if(i<10) {
                list.add(n);
            }
            else {
                list2.add(n);
            }
        }

        Collections.sort(list, Collections.reverseOrder());
        Collections.sort(list2, Collections.reverseOrder());

        int sum = 0;
        int sum2 = 0;
        for(int i=0; i<3; i++) {
            sum += list.get(i);
            sum2 += list2.get(i);
        }

        System.out.println(sum + " " + sum2);
    }
}
