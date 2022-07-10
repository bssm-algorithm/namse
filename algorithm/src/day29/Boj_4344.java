package day29;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
배열에 다 정하면서 다 더함
더한 걸 개수로 나눈 값 k 을 저장
배열을 돌리면서 k보다 크다면 cnt++
개수 / cnt 출력
 */
public class Boj_4344 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();

        for(int i=0; i<c; i++) {
            int n = sc.nextInt();
            int sum = 0;
            int k = 0;
            float cnt = 0;
            List<Integer> list = new ArrayList<>();

            for(int j=0; j<n; j++) {
                list.add(sc.nextInt());
                sum += list.get(j);
            }

            k = sum/n;

            for(int l=0; l<list.size(); l++) {
                if(list.get(l) > k) {
                    cnt++;
                }
            }

            float ans = (cnt/n)*100;
            System.out.println(String.format("%.3f", ans) + "%");
        }
    }
}
