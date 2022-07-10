package day29;

import java.util.ArrayList;
import java.util.List;

public class Boj_4673 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for(int i=1; i<=10000; i++) {
            String s = String.valueOf(i);
            int cnt = Integer.parseInt(s);

            for(int j=0; j<s.length(); j++) {
                cnt += Integer.parseInt(String.valueOf(s.charAt(j)));
            }
            list.add(cnt);
            list2.add(i);
        }
        list2.removeAll(list);
        list2.stream().forEach(System.out::println);
    }
}
