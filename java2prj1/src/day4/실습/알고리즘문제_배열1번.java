package day4.실습;

import java.util.*;

public class 알고리즘문제_배열1번 {
    public static void main(String[] args) {
       

    	 // 입력
        int[] integer = {7, 3, 9, 5, 6, 12};
        int n = integer.length;

        // 처리 및 출력
        System.out.print(integer[0] + " "); // 첫 번째 수는 무조건 출력

        for (int i = 1; i < n; i++) {
            if (integer[i - 1] < integer[i]) {
                System.out.print(integer[i] + " ");
            }
        }
    }
}