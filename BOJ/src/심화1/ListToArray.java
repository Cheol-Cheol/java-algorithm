package 심화1;

import java.util.ArrayList;
import java.util.Arrays;

public class ListToArray {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("A");
        arrList.add("B");
        arrList.add("C");

        // ArrayList를 배열로 변환
        int arrListSize = arrList.size();
        String[] arr = arrList.toArray(new String[arrListSize]);

        System.out.println(Arrays.toString(arr));
    }
}
