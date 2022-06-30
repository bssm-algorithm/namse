package day19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_10845 {

    static int[] queue = new int[10000];
    static int first = 0;
    static int last = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String s = st.nextToken();

            switch (s) {
                case "push" :
                    push(Integer.parseInt(st.nextToken()));
                    break;

                case "pop" :
                    System.out.println(pop());
                    break;

                case "size" :
                    System.out.println(size());
                    break;

                case "empty" :
                    System.out.println(empty());
                    break;

                case "front" :
                    System.out.println(front());
                    break;

                case "back" :
                    System.out.println(back());
                    break;
            }
        }
    }

    public static void push(int n) {
        queue[last] = n;
        last++;
    }

    public static int pop() {
        if(last-first == 0) {
            return -1;
        }
        else {
            int temp = queue[first];
            queue[first] = 0;
            first++;
            return temp;
        }
    }

    public static int size() {
        return last-first;
    }

    public static int empty() {
        if(last-first == 0) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public static int front() {
        if(last-first == 0) {
            return -1;
        }
        else {
            return queue[first];
        }
    }

    public static int back() {
        if(last-first == 0) {
            return -1;
        }
        else {
            return queue[last -1];
        }
    }

}
