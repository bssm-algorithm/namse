package day13;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Boj_1764 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        List<String> result = new ArrayList<>();

        int sum = n+m;

        for(int i=0; i<sum; i++) {
            list.add(sc.next());

        }
        for(int j=0; j<n; j++) {
            list2.add(list.get(j));
        }

        for(int k=n+1; k<sum; k++) {
            list3.add(list.get(k));
        }

        for(int o=0; o<list3.size(); o++) {
            if(list2.indexOf(list3.get(o)) != -1) {
                result.add(list3.get(o));
            }
        }

        System.out.println(result.size());
        result.stream().sorted().forEach(p -> System.out.println(p));
    }
}
