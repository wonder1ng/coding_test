import java.util.Arrays;

class Solution {
    // https://school.programmers.co.kr/learn/courses/30/lessons/181941?language=java
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c"};
        System.out.println(solution(arr));
        System.out.println(solution2(arr));
    }

    public static String solution(String[] arr) {
        return String.join("", arr);
    }
    public static String solution2(String[] arr) {
        // 예전에 풀었던 정답으로 stream이 뭔지 기억도 안 남
        // 병렬 처리할 수 있게 해주는 메서드라는데 reduce를 쓰기 위해 변환한 듯
        return Arrays.stream(arr).reduce("", (p, c) -> p + c);
    }
}
