package lv1;

public class 서울에서김서방찾기 {
    public String solution(String[] seoul) {
        String answer = "";

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                answer += i;
                break;
            }
        }

        return "김서방은 " + answer + "에 있다";
    }

    public static void main(String[] args) {
        서울에서김서방찾기 T = new 서울에서김서방찾기();
        String[] data = {"Jane", "Kim"};

        System.out.println(T.solution(data));
    }
}
