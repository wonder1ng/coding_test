
class Solution {
    // https://school.programmers.co.kr/learn/courses/30/lessons/181925?language=java
    public static void main(String[] args) {
        System.out.println(solution(new int[] {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1})); 
    }
    public static String solution(int[] numLog) {
        String answer = "";
        for (int i = 1; i < numLog.length; i++) {
            switch (numLog[i] - numLog[i - 1]) {
                case 1 -> answer += "w";
                case -1 -> answer += "s";
                case 10 -> answer += "d";
                case -10 -> answer += "a";
            }
        }
        return answer;
    }
}
