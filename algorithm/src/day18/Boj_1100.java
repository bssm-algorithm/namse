package day18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*      내코드 추가
        역시 수학적 머리가 필요함
        하얀칸 : (0,0) (0,2) ... (1,1) (1,3)
        저걸 보고 i+j가 짝수면 되구나라는 걸 어떻게 알까

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        int temp = 1;

        for(int i=0; i<8; i++) {
            String s = br.readLine();

            if(i%2==1) {
                for(int j=0; j<8; j++) {
                    if(j%2==1 && s.charAt(j) == 'F') {
                        cnt++;
                    }
                }
            }
            else {
                for(int j=0; j<8; j++) {
                    if(j%2==0 && s.charAt(j) == 'F') {
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
 */

public class Boj_1100 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;

        for(int i=0; i<8; i++) {
            String s = br.readLine();

            for(int j=0; j<8; j++) {
                if((i+j)%2==0 && s.charAt(j) == 'F') {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
