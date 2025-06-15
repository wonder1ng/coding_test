import java.util.stream.IntStream;

class Solution {
    // https://school.programmers.co.kr/learn/courses/30/lessons/181931?language=java
    public static void main(String[] args) {
        boolean[] included = {true, false, false, true, true};
        System.out.println(solution(3, 4, included));
    }
    
    public static int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int current = a - d;
        for (boolean bool: included) {
            current += d;
            answer += bool ? current : 0;
        }
        return answer;
    }
    

    public static int solution2(int a, int d, boolean[] included) {
        // 이상재 님 코드. IntStream을 처음 앎
        return IntStream.range(0, included.length).map(
                idx -> included[idx] ? a + (idx * d) : 0).sum();
    }
}
