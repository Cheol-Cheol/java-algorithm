package lv1;

/**
 * 숫자 -> 문자열
 * 방법1) 문자열 순회, 숫자형으로 변경 후 더하기
 * 방법2) While 반복문으로 숫자를 나머지 연산을 수행하여 일의 자릿수 부터 합계를 구한다.
 * - 각 자릿수를 다 더한 뒤, 10 이하일 경우 break
 * - 각 자릿수를 더할 때 마다, 자릿수 이동을 위해 나누기 연산 수행
 */
public class 자릿수_더하기 {
    public int solution(int n) {
        int answer = 0;

        while(true) {
            answer += n % 10;

            if(n < 10){
                break;
            }

            n = n / 10;
        }

        return answer;
    }

    public static void main(String[] args) {
        자릿수_더하기 T = new 자릿수_더하기();
        System.out.println(T.solution(987));
    }
}

// public int solution(int n) {
//     int answer = 0;
//
//     String[] numStrArr = String.valueOf(n).split("");
//     for (String s : numStrArr) {
//         answer += Integer.parseInt(s);
//     }
//
//     return answer;
// }