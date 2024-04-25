package 스택_큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b28278 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Stack stack = new Stack(N);
        StringTokenizer st;

        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());
            int cmd = Integer.parseInt(st.nextToken());
            switch (cmd) {
                case 1:
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    int pop = stack.pop();
                    sb.append(pop + "\n");
                    break;
                case 3:
                    int size = stack.size();
                    sb.append(size + "\n");
                    break;
                case 4:
                    int empty = stack.isEmpty();
                    sb.append(empty + "\n");
                    break;
                case 5:
                    int peek = stack.peek();
                    sb.append(peek + "\n");
                    break;
            }
        }

        br.close();
        System.out.println(sb);
    }

    public static class Stack {

        private int[] arr;
        private int pos;
        private int num;
        private int capacity;

        public Stack(int max) {
            pos = 0;
            capacity = max;
            arr = new int[capacity];
        }

        public int push(int val) {
            arr[pos++] = val;
            num++;

            if (pos == capacity) {
                pos = 0;
            }
            return val;
        }

        public int pop() {
            if (num <= 0) {
                return -1;
            }
            int el = arr[--pos];
            num--;

            if (pos < 0) {
                pos = 0;
            }
            return el;
        }

        public int size() {
            return num;
        }

        public int isEmpty() {
            return num == 0 ? 1 : 0;
        }

        public int peek() {
            return num > 0 ? arr[pos - 1] : -1;
        }
    }
}
