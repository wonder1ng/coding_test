import java.util.Arrays;

class Solution {
    // https://school.programmers.co.kr/learn/courses/30/lessons/181927?language=java
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{2, 1, 6}))); 
    }
    
    public static int[] solution(int[] num_list) {
        int idx = num_list.length;
        int[] answer = Arrays.copyOf(num_list, idx + 1);
        answer[idx] = num_list[idx - 1] > num_list[idx - 2] ? num_list[idx - 1] - num_list[idx - 2] : num_list[idx - 1] * 2;
        return answer;
    }
}
