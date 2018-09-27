public class Solution {

    /*제한 사항
    n은 0 이상 3000이하인 자연수입니다.
    입출력 예
    n	return
            12	28
            5	6
    입출력 예 설명
    입출력 예 #1
            12의 약수는 1, 2, 3, 4, 6, 12입니다. 이를 모두 더하면 28입니다.

    입출력 예 #2
            5의 약수는 1, 5입니다. 이를 모두 더하면 6입니다.*/

    public static int solution(int n) {
        int answer = 0;
        // 1. 사용자에게 입력을 받는다.

        // 2. for문을 이용하여 i가 0부터 n까지 증가할때까지 i를 ++시켜준다
        if (n == 0) {
            answer = 0;
        } else {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    answer += i;
                }
            }
        }
        // 3. for문 안에서 입력값을 i로 나누어준다.
        // 4. 나누었을 때 나머지가 0인 경우를 if문으로 구별한다.
        // 5. 구별된 수들을 합하여준다.
        // 6. 출력한다!

        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution(0));
        System.out.println(solution(12));
        System.out.println(solution(5));
    }

}
