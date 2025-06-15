class Solution {
    // https://school.programmers.co.kr/learn/courses/30/lessons/181932?language=java
    public static void main(String[] args) {
        System.out.println(solution("abc1abc1abc"));
    }
    
    public static String solution(String code) {
        boolean mode = false;
        String answer = "";
        for (int i = 0; i < code.length(); i++) {
            char a = code.charAt(i);
            if (a == '1') {
                mode = !mode;
            } else if (mode) {
                answer += i % 2 == 1 ? a : "";
            } else {
                answer += i % 2 == 0 ? a : "";
            };
        };
        return answer == "" ? "EMPTY" : answer;
    }
}