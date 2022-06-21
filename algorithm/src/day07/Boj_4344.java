package day07;

import java.util.ArrayList;
import java.util.Scanner;

public class Boj_4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> score = new ArrayList<>();
        int result = 0;
        int sum = 0;

        int case_num = sc.nextInt();

        for(int i=0; i<case_num; i++) {
            int std_num = sc.nextInt(); //학생수

            for(int j=0; j<std_num; j++) {
                score.add(sc.nextInt()); //학생 수 만큼 입력받기
                sum += score.get(j); //입력한 것을 다 더함

                result = sum/std_num; //평균

                if(score.get(j) > result) { //만약 점수가 평균보다 높다면
                    double[] ratio = new double[j];
                    ratio[j] = score.get(j); //새로운 배열에 넣음
                }
            }
            System.out.println(result);
        }
    }
}
