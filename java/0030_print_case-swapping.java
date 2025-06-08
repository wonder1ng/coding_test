class Solution {
    // https://school.programmers.co.kr/learn/courses/30/lessons/181949?language=java
    public static void main(String[] args) {
        solution("aBcDeFg");
    }

    public static void solution(String args) {
        for (char b: args.toCharArray()) {
            System.out.print(Character.isUpperCase(b) 
            ? Character.toLowerCase(b) : Character.toUpperCase(b));
        }   
    }
}