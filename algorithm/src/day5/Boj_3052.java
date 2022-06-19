package day5;

import java.util.*;
import java.util.stream.Collectors;

public class Boj_3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr2 = new ArrayList<>(10);
        ArrayList<Integer> pr2 = new ArrayList<>(10);
        int j=0;
        int count = 0;

        for(int i=0; i<10; i++) {
            arr2.add(sc.nextInt());
            pr2.add(arr2.get(i)%42);
        }

        List result = pr2.stream().distinct().collect(Collectors.toList());

        System.out.println(result.size());
    }
}
