package day06;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Boj_8958 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int sum = 0;
        ArrayList<String> arr = new ArrayList<>();

        // OOXXOOXXOO
        for(int j=0; j<n; j++) {
            arr.add(sc.next());

            for (int k = 0; k < arr.get(j).length(); k ++){

                if (arr.get(j).charAt(k) == 'O'){
                    cnt ++;
                    sum += cnt;
                }else {
                    cnt = 0;
                }
            }

            System.out.println(sum);
            sum=0;
            cnt=0;
        }

    }
}
