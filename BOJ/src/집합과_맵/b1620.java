package 집합과_맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// keySet를 통해 Map 전체를 순회하는 것은 비효율적이고 시간초과가 발생할 수 있다.
// HashMap을 2개로 만들어서 접근하는게 시간복잡도를 O(1)로 줄일 수 있다.
public class b1620 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<Integer, String> pocketArr_String = new HashMap<>();
        Map<String, Integer> pocketArr_int = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String str = br.readLine();
            pocketArr_String.put(i, str);
            pocketArr_int.put(str, i);
        }

        for (int i = 0; i < M; i++) {
            String pocket = br.readLine();
            if (isNum(pocket)) {
                sb.append(pocketArr_String.get(Integer.parseInt(pocket)) + "\n");
            } else {
                sb.append(pocketArr_int.get(pocket) + "\n");
            }
        }
        System.out.println(sb);
        br.close();
    }

    public static boolean isNum(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
