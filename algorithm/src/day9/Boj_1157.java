package day9;

import java.util.*;

public class Boj_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(); //문자열을 입력받음 ex) zZa
        int max = 0; //가장 많이 사용된 알파벳 개수
        int same = 0; //
        String result = new String();

        String[] arr = s.split(""); //알파벳으로 쪼개고 [z, Z, a]

        List<String> list = new ArrayList<>(Arrays.asList(arr)); //Collections.frequency을 사용하기 위해 List로 형변환시킴

        for(int i=0; i<arr.length; i++) { // 내가 입력한 문자 끝까지
            if(Collections.frequency(list, arr[i]) > max) { // z의 개수가 0보다 크다면
                result = arr[i]; //z넣어주고
                max = Collections.frequency(list, arr[i]); //max를 z의 개수로 바꿔줌
            }

            if(arr[i+1] == result && max == Collections.frequency(list, arr[i+1])) {

            }

            if(max == Collections.frequency(list, arr[i])) {
                same = Collections.frequency(list, arr[i]);
//                System.out.println("?");
//                break;
            }
        }

        if(max == same) {
            System.out.println("?");
        }

        System.out.println(result.toUpperCase());
    }
}
