package 집합과_맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class b7785 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<String, String> hMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String[] target = br.readLine().split(" ");
            if (target[1].equals("leave")) {
                hMap.remove(target[0]);
            } else {
                hMap.put(target[0], target[1]);
            }
        }

        List<String> keySet = new ArrayList<>(hMap.keySet());
        Collections.sort(keySet, Collections.reverseOrder());
        for (String s : keySet) {
            System.out.println(s);
        }
    }
}
