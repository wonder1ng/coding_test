class Solution {
    // https://school.programmers.co.kr/learn/courses/30/lessons/181937?language=java
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c"};
        System.out.println(solution(98, 2));
        System.out.println(solution(34, 3));
        System.out.println(solution2(98, 2));
        System.out.println(solution2(34, 3));
    }

    public static int solution(int num, int n) {
        return num % n == 0 ? 1 : 0;
    }
    public static int solution2(int num, int n) {
        // Boolean.compare(x, y): 인자를 숫자로 치환하여 x가 크면 1, 같으면 0, 작으면 -1 반환
        return Boolean.compare(num % n == 0, true) + 1;
    }
}
