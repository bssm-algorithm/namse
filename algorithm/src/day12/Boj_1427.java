package day12;

import java.util.*;

public class Boj_1427 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String  s = sc.next();

        List<String> list = new ArrayList<>(Arrays.asList(s.split("")));

        Collections.sort(list);
        Collections.reverse(list);

        list.stream().forEach(p -> System.out.print(p));
    }
}
