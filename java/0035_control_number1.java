
class Solution {
    // https://school.programmers.co.kr/learn/courses/30/lessons/181926?language=java
    public static void main(String[] args) {
        System.out.println((char) solution(0, "wsdawsdassw")); 
    }
    
    public static  int solution(int n, String control) {
        for (char a: control.toCharArray()) {
            switch (a) {
                case 'w':
                    n++;
                    break;
                case 's':
                    n--;
                    break;
                case 'd':
                    n += 10;
                    break;
                case 'a':
                    n -= 10;
                    break;
            }
        }
        return n;
    }

    public static  int solution2(int n, String control) {
        // switch도 람다식?이 있었다. vscode가 알려줌
        for (char a: control.toCharArray()) {
            switch (a) {
                case 'w' -> n++;
                case 's' -> n--;
                case 'd' -> n += 10;
                case 'a' -> n -= 10;
            }
        }
        return n;
    }
}
