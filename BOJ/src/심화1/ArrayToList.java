package 심화1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayToList {
    public static void main(String[] args) {
        // ❌ 1. Arrays.asList() - 고정 길이의 배열을 반환, 같은 참조값을 갖음
        String[] arr = {"A", "B", "C"};
        List<String> list = Arrays.asList(arr);

        System.out.println(list.get(0)); // "A"
        System.out.println(list.get(1)); // "B"
        System.out.println(list.get(2)); // "C"

        // 🚨 Arrays.asList() 주의점
        // List로 변환 후, List에 값을 '추가'하는 것이 불가능하고, 원래 배열의 값을 변경하면 List의 값도 변경된다.
        arr[0] = "A값 바꿈 - List에 영향있음";
        System.out.println(list.get(0)); // "D", 원본 배열 값의 변경이 List의 값도 같이 변경됨
        // list.add("E"); // 에러 발생

        System.out.println("----------------------------------------------");
        arr[0] = "A";

        // ✅ 2. new ArrayList<>(Arrays.asList())
        // 원본 배열의 값과 List의 값이 동기화되는 것을 막기 위해서 다음과 같이 사용
        List<String> list2 = new ArrayList<>(Arrays.asList(arr));
        arr[0] ="바뀜? - 이제는 List에 영향없음";
        list2.add("추가됨? - 고정 길이가 아니라서 이제 추가도 가능");

        System.out.println(list2.get(0));
        System.out.println(list2.get(1));
        System.out.println(list2.get(2));
        System.out.println(list2.get(3));

        System.out.println("----------------------------------------------");
        arr[0] = "A";

        // ✅ 3. Collectors.toList()
        // Stream의 collect()는 데이터를 원하는 타입으로 변경해준다.
        List<String> list3 = Stream.of(arr).collect(Collectors.toList());

        System.out.println(list3.get(0));
        System.out.println(list3.get(1));
        System.out.println(list3.get(2));
    }
}
