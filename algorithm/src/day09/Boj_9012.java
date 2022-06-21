package day09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj_9012 {

    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        int n = sc.nextInt();
        int n = Integer.parseInt(bf.readLine());
        boolean firm = true;

        for(int i=0; i<n; i++) {
//            String s = sc.next();
            String s = bf.readLine();
            String[] arr = s.split("");
            List<String> list = new ArrayList<>(Arrays.asList(arr));

            Stack<String> stack = new Stack<>();

            if(list.get(i) == "(") {
                stack.push(list.get(i));
                if(list.get(i) == ")") {
                    stack.pop();
                    stack.pop();
                }

                if(stack.isEmpty()) {
                    firm = false;
                }
                else {
                    firm = true;
                }
            }

            if(Collections.frequency(list, "(") == Collections.frequency(list, ")") && firm == false) {
                    System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
