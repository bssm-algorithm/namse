package day25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 시간초과
public class Boj_17176 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        char[] change = new char[n];
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");

        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        String ans = br.readLine();
        for(int i=0; i<arr.length; i++) {

            if(arr[i] == 0) {
                change[i] = ' ';
            }

            if(1 <= arr[i] && arr[i] <= 26) {
                change[i] = (char) (arr[i] + 64);
            }
            else if(27 <= arr[i] && arr[i] <= 52) {
                change[i] = (char) ((arr[i] + 70));
            }
        }

        int cnt = 0;
        char[] result = new char[ans.length()];

        for(int i=0; i<ans.length(); i++) {
            for(int j=0; j<change.length; j++) {
                if(ans.charAt(i) == change[j]) {
                    result[i] = change[j];
                }
            }
        }

        for(int i=0; i< result.length; i++) {
            if(result[i] == ans.charAt(i)) {
                cnt++;
            }
        }
        if(cnt == result.length) {
            System.out.println("y");
        }
        else {
            System.out.println("n");
        }
    }
}
