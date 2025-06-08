import java.util.Arrays;

class Solution {
    // https://school.programmers.co.kr/learn/courses/30/lessons/181929?language=java
    public static void main(String[] args) {
        System.out.println(solution(new int[] {3, 4, 5, 2, 1}));
        System.out.println(solution(new int[] {5, 7, 8, 3}));
    }

    public static int solution(int[] num_list) {
        // IntStream stream = Arrays.stream(num_list); 
        // 위의 코드 사용 불가
        // 스트림은 1회용 자료형이기에 아래에서 reduce에 사용하면 두 번째 reduce에서 오류
        return Arrays.stream(num_list).reduce(1 , (p, c) -> p * c) < Math.pow(Arrays.stream(num_list).reduce(0 , (p, c) -> p + c), 2) ? 1 : 0;
    }
}
