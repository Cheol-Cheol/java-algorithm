package 집합과_맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// System.out.println을 사용할 경우, 호출할 때마다 출력 버퍼를 비우고, I/O작업을 수행하기 때문에 많은 양의 데이터를 처리하고
// 출력할 경우 "시간초과"가 발생할 수 있다.
// 반면, StringBuilder는 문자열을 메모리 내에서 미리 조합하고, 최종적으로 한 번에 출력하기 때문에 반복적인 I/O작업을 줄일 수 있어
// 실행시간을 단축시킬 수 있다.
public class b10816 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Map<Integer, Integer> hashMap = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int key = Integer.parseInt(st.nextToken());
            if (hashMap.containsKey(key)) hashMap.put(key, hashMap.get(key) + 1);
            else hashMap.put(key, 1);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int key = Integer.parseInt(st.nextToken());
            if (hashMap.containsKey(key)) sb.append(hashMap.get(key) + " ");
            else sb.append(0 + " ");
        }
        System.out.println(sb);
        br.close();
    }
}
