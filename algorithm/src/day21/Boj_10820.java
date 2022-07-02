package day21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*      내코드 :
        1. IO 입출력방식을 몰랐음
        2. 그냥 'a' <= 이렇게 쓰면 되는데 아스키밖에 생각이 안나서  쫄았음
        3. 굳이 배열로 안넣고 따로 변수 만듬

        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        while(sc.hasNext()) {
            String s = sc.nextLine();

            for(int i=0; i<s.length(); i++) {
                if(97 <= s.charAt(i) && s.charAt(i) <= 122) {
                    a++;
                }
                else if(65 <= s.charAt(i) && s.charAt(i) <= 90) {
                    b++;
                }
                else if(0 <= s.charAt(i) - '0' && s.charAt(i) - '0' <= 9) {
                    c++;
                }
                else if(s.charAt(i) == ' ') {
                    d++;
                }
            }
            System.out.println(a + " " + b + " " + c + " " + d);
            a = 0;
            b = 0;
            c = 0;
            d = 0;
        }

 */

public class Boj_10820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = "";

        while((s = br.readLine()) != null) {
            int[] arr = new int[4];

            for(int i=0; i<s.length(); i++) {
                if('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
                    arr[0] += 1;
                }
                else if('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
                    arr[1] += 1;
                }
                else if('0' <= s.charAt(i) && s.charAt(i) <= '9') {
                    arr[2] += 1;
                }
                else if(s.charAt(i) == ' ') {
                    arr[3] += 1;
                }
            }
            for(int v : arr) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }
}
