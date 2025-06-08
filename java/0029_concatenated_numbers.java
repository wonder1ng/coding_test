
import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    // https://school.programmers.co.kr/learn/courses/30/lessons/181928?language=java
    public static void main(String[] args) {
        System.out.println(solution(new int[] {3, 4, 5, 2, 1}));
        System.out.println(solution(new int[] {5, 7, 8, 3}));
        System.out.println(solution2(new int[] {3, 4, 5, 2, 1}));
        System.out.println(solution2(new int[] {5, 7, 8, 3}));
    }

    public static int solution(int[] num_list) {
        int a = 0;
        int b = 0;
        for (int num: num_list) {
            if (num % 2 == 0) {
                a = a * 10 + num;
            } else {
                b = b * 10 + num;
            }
        }
        return a + b;
    }
    public static int solution2(int[] num_list) {
        // 홍희표 님 코드
        // 다만 홀수나 짝수 부재 시 오류 발생
        return Integer.parseInt(
            Arrays.stream(num_list)
            .filter(value -> value % 2 != 0)
            // .mapToObj(String::valueOf): 정수를 문자열로 변환(String.valueOf(n)과 같음)
            .mapToObj(String::valueOf)
            // .collect(Collectors.joining()): 문자열 합침
            .collect(Collectors.joining())
            ) + 
            Integer.parseInt(
                Arrays.stream(num_list)
                .filter(value -> value % 2 == 0)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining()));
    }
}
