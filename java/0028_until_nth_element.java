import java.util.Arrays;

class Solution {
    // https://school.programmers.co.kr/learn/courses/30/lessons/181889?language=java
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {2, 1, 6}, 1)));
        System.out.println(Arrays.toString(solution(new int[] {5, 2, 1, 7, 5}, 3)));
        System.out.println(Arrays.toString(solution2(new int[] {2, 1, 6}, 1)));
        System.out.println(Arrays.toString(solution2(new int[] {5, 2, 1, 7, 5}, 3)));
        System.out.println(Arrays.toString(solution3(new int[] {2, 1, 6}, 1)));
        System.out.println(Arrays.toString(solution3(new int[] {5, 2, 1, 7, 5}, 3)));
    }

    public static int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = num_list[i];
        }
        return answer;
    }
    public static int[] solution2(int[] num_list, int n) {
        int[] answer = new int[n];
        // vscode가 고쳐준 코드. arraycopy라는 게 있는지 처음 앎
        System.arraycopy(num_list, 0, answer, 0, n);
        return answer;
    }
    public static int[] solution3(int[] num_list, int n) {
        // 타인 코드 참고: copyOfRange: 원하는 범위만 복사
        int[] answer = Arrays.copyOfRange(num_list, 0, n);
        return answer;
    }
}
