package day20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Boj_2161 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> que = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());

        for(int i=1; i<=n; i++) {
            que.offer(i);
        }

        while(que.size() > 1) {
            System.out.print(que.poll() + " ");
            que.offer(que.poll());
        }

        System.out.println(que.poll());
    }
}
