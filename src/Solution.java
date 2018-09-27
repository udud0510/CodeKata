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

        if (n != 0) {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    answer += i;
                }
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution(0));
        System.out.println(solution(12));
        System.out.println(solution(5));
    }

}
