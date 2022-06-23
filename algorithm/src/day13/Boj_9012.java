package day13;

import java.io.*;
import java.util.*;

public class Boj_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<n; i++) {
            String s = bf.readLine();

            for(int j=0; j<s.length(); j++) {
                stack.push(s.charAt(j));

                for(int o=0; o<stack.size(); o++) {
                    if(stack.get(o) == ')') {
                        if(stack.get(0) == ')') {
                            break;
                        }
                        stack.pop();
                        stack.pop();
                        o = 0;
                    }
                }
            }

            if (stack.isEmpty()){
                System.out.println("YES");
            }else {
                    System.out.println("NO");
            }

            stack.clear();
        }
    }
}
