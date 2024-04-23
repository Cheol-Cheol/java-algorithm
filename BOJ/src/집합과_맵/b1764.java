package 집합과_맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class b1764 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Set<String> hashSet = new HashSet<>();
        for (int i = 0; i < N; i++) {
            hashSet.add(br.readLine());
        }

        List<String> result = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String str = br.readLine();
            if (hashSet.contains(str)) {
                result.add(str);
            }
        }

        Collections.sort(result);
        System.out.println(result.size());
        for (String s : result) {
            System.out.println(s);
        }
    }
}
