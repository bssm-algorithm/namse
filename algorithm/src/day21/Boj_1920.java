package day21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj_1920 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        int[] ans = new int[m];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<m; i++) {
            ans[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<ans.length; i++) {

            int key = ans[i];
            int start = 0;
            int end = ans.length-1;
            int result = 0;
            int mid = 0;

            while(start <= end) {
                mid = (start+end)/2;

                if(key == arr[mid]) {
                    result = 1;
                    break;
                }
                else if(key < arr[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid +1;
                }
            }
            System.out.println(result);
        }
    }
}
