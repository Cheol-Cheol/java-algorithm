package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int result = 0;

        // 1. 문자열로 접근하는 방법
        for (int i = 0; i < N; i++) {
            // '0'(ASCII = 48) - int로 연산하기 때문에 작은 타입 -> 큰 타입으로 암묵적 형변환 발생
            result += str.charAt(i) - '0';
        }

        // 2. String.getBytes(): String을 charset으로 인코딩하여 byte 배열로 반환해준다.
        for (byte value : br.readLine().getBytes()) {
            result += (value - '0');
        }

        System.out.println(result);
    }
}
