import java.util.stream.IntStream;

class Solution {
    // https://school.programmers.co.kr/learn/courses/30/lessons/181930?language=java
    public static void main(String[] args) {
        System.out.println((char) solution(2, 6, 1));
    }
    
    public static  int solution(int a, int b, int c) {
        int answer = 0;
        if (a == b && b == c) {
            answer = IntStream.of(a, b, c).reduce(0, (p, v) -> p + v);
            answer *= IntStream.of(a, b, c).reduce(0, (p, v) -> p + v * v);
            answer *= IntStream.of(a, b, c).reduce(0, (p, v) -> p + v * v * v);
        } else if (a != b && b != c && a != c) {
            answer = a + b + c;
        } else {
            answer = a + b + c;
            answer *= a * a + b * b + c * c;
        }
        return answer;
    }
}
