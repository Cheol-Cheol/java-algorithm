package lv1;

import java.util.Arrays;

public class 서울에서_김서방_찾기 {
    public String solution(String[] seoul) {
        int idx = Arrays.asList(seoul).indexOf("Kim");
        return "김서방은 " + idx + "에 있다";
    }

    public static void main(String[] args) {
        서울에서_김서방_찾기 T = new 서울에서_김서방_찾기();
        String[] data = {"Jane", "Kim"};

        System.out.println(T.solution(data));
    }
}

// public String solution(String[] seoul) {
//     for (int i = 0; i < seoul.length; i++) {
//         if(seoul[i].equals("Kim")) {
//             return "김서방은 " + i + "에 있다";
//         }
//     }
//     return null;
// }