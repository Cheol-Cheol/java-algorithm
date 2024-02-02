package doit.자료구조.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1427 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] iptChars = br.readLine().toCharArray();
        int N = iptChars.length;
        int[] ipt = new int[iptChars.length];
        for (int i = 0; i < N; i++) {
            ipt[i] = iptChars[i] - 48;
        }

        for (int i = 0; i < N - 1; i++) {
            int MAX = Integer.MIN_VALUE;
            int idx = i;

            for (int j = i + 1; j < N; j++) {
                if (MAX < ipt[j]) {
                    MAX = ipt[j];
                    idx = j;
                }
            }

            // swap
            if (ipt[i] < MAX) {
                int tmp = ipt[i];
                ipt[i] = MAX;
                ipt[idx] = tmp;
            }
        }

        for (int i : ipt) {
            System.out.print(i);
        }
    }
}
