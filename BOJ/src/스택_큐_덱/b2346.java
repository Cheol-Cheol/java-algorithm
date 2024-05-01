package 스택_큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class b2346 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Deque<Balloon> deque = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] balloonPaper = new int[N]; // 풍선에 적힌 숫자 저장
        for (int i = 0; i < N; i++) {
            balloonPaper[i] = Integer.parseInt(st.nextToken());
        }

        sb.append("1 "); // 첫 번째 풍선 먼저 터트림
        int moveValue = balloonPaper[0]; // 맨 처음 움직여야할 이동 값
        // 두 번째 풍선부터 풍선의 기존 위치 데이터와 함께 저장
        for (int i = 1; i < N; i++) {
            deque.add(new Balloon(i + 1, balloonPaper[i]));
        }

        // 모든 풍선이 터질 때까지 반복
        while (!deque.isEmpty()) {
            // 양수
            if (moveValue > 0) {
                for (int i = 1; i < moveValue; i++) {
                    deque.addLast(deque.pollFirst());
                }
                Balloon nextBalloon = deque.pollFirst();
                moveValue = nextBalloon.numValue;
                sb.append(nextBalloon.idx + " ");
            } else { // 음수
                for (int i = 1; i < -moveValue; i++) {
                    deque.addFirst(deque.pollLast());
                }
                Balloon nextBalloon = deque.pollLast();
                moveValue = nextBalloon.numValue;
                sb.append(nextBalloon.idx + " ");
            }
        }
        System.out.println(sb);
        br.close();
    }
}

class Balloon {
    int idx;
    int numValue;

    public Balloon(int idx, int numValue) {
        this.idx = idx;
        this.numValue = numValue;
    }
}