package day19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_10828 {
    public static int[] stack = new int[10000];
    public static int size = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String s = st.nextToken();

            if(s.equals("push")) {
                push(Integer.parseInt(st.nextToken()));
            }
            else if(s.equals("pop")) {
                System.out.println(pop());
            }
            else if(s.equals("size")) {
                System.out.println(size());
            }
            else if(s.equals("empty")) {
                System.out.println(empty());
            }
            else if(s.equals("top")) {
                System.out.println(top());
            }
        }
    }

    public static void push(int n) {
        stack[size] = n;
        size++;
    }

    public static int pop() {
        if(size == 0) {
            return -1;
        }
        else {
            int temp = stack[size -1]; //삭제할 값을 미리 저장
            stack[size -1] = 0;
            size--;
            return temp;
        }
    }

    public static int size() {
        return size;
    }

    public static int top() {
        if(size == 0) {
            return -1;
        }
        else {
            return stack[size -1];
        }
    }

    public static int empty() {
        if(size == 0) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
