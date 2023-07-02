package lv1;

public class 문자열내p와y의개수 {
        boolean solution(String s) {
            boolean answer = true;
            int pCount = 0;
            int yCount = 0;

            s = s.toLowerCase();
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == 'p') pCount++;
                else if(s.charAt(i) == 'y') yCount++;
            }

            if(pCount != yCount) answer = false;

            return answer;
        }

    public static void main(String[] args) {
        문자열내p와y의개수 T = new 문자열내p와y의개수();
        System.out.println(T.solution("pPoooyY"));
    }
}
