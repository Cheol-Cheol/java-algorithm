package doit.자료구조.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class mData implements Comparable<mData> {
    int value;
    int idx;

    public mData(int value, int idx) {
        this.value = value;
        this.idx = idx;
    }

    @Override
    public int compareTo(mData o) {
        return this.value - o.value;
    }
}

public class b1377 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        mData[] A = new mData[N];
        for (int i = 0; i < N; i++) {
            A[i] = new mData(Integer.parseInt(br.readLine()), i);
        }

        // 정렬 O(nlogn)
        Arrays.sort(A);

        int MAX = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) { // i: 정렬 후 인덱스
            MAX = Math.max(MAX, A[i].idx - i);
        }

        System.out.println(MAX + 1);
    }
}

