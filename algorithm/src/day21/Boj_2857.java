package day21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Boj_2857 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        boolean re = false;
        boolean re22 = false;

        for(int i=1; i<=5; i++) {
            String s = br.readLine();
            if(s.contains("FBI")) {
                list.add(i);
                re22 = true;
            }
            else {
                re = true;
            }
        }

        if(re == true && re22 == false) {
            System.out.println("HE GOT AWAY!");
        }
        else {
            list.stream().forEach(p -> System.out.println(p));
        }
    }
}
