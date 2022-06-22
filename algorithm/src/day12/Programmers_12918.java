package day12;

public class Programmers_12918 {
    public boolean solution(String s) {
        boolean answer = true;

        char c = 'a';
        char c2 = 'A';

        if(s.length() != 4 && s.length() != 6) {
            return false;
        }

        for(int i=0; i<25; i++) {
            for(int j=0; j<s.length(); j++) {
                if(s.indexOf(c) == -1 && s.indexOf(c2) == -1) {
                    c++;
                    c2++;
                }
                else {
                    answer = false;
                    return answer;
                }
            }

        }
        return answer;
    }
}
