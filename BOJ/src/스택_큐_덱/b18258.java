package 스택_큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b18258 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        Queue queue = new Queue(N); // 큐 배열의 크기는 명령의 수(N)보다 크거나 작을 수 밖에 없음

        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            switch (cmd) {
                case "push":
                    int x = Integer.parseInt(st.nextToken());
                    queue.push(x);
                    break;
                case "pop":
                    int pop = queue.pop();
                    sb.append(pop + "\n");
                    break;
                case "size":
                    int size = queue.size();
                    sb.append(size + "\n");
                    break;
                case "empty":
                    int empty = queue.empty();
                    sb.append(empty + "\n");
                    break;
                case "front":
                    int front = queue.front();
                    sb.append(front + "\n");
                    break;
                case "back":
                    int back = queue.back();
                    sb.append(back + "\n");
                    break;
            }
        }

        System.out.println(sb);
        br.close();
    }

    public static class Queue {
        private int[] que; // 큐의 용량
        private int front; // 앞단
        private int rear; // 뒷단
        private int num; // 배열 요소 갯수
        private int capacity; // 배열 용량

        public Queue(int max) {
            num = 0;
            front = 0;
            rear = 0;
            capacity = max;
            que = new int[capacity];
        }

        public void push(int val) {
            que[rear++] = val;
            num++;

            if (rear == capacity) {
                rear = 0;
            }
        }

        public int pop() {
            if (num <= 0) {
                return -1;
            }
            int result = que[front++];
            num--;

            if (front == capacity) {
                front = 0;
            }
            return result;
        }

        public int size() {
            return num;
        }

        public int empty() {
            if (num > 0) {
                return 0;
            }
            return 1;
        }

        public int front() {
            if (num == 0) {
                return -1;
            }
            return que[front];
        }

        public int back() {
            if (num == 0) {
                return -1;
            }
            return que[rear - 1];
        }
    }
}

