package level2;

public class Solution2_6 {
    /*
    <주식가격>
    초 단위로 기록된 주식가격이 담긴 배열 prices가 매개변수로 주어질 때,
    가격이 떨어지지 않은 기간은 몇 초인지를 return 하도록 solution 함수를 완성하세요.

    prices	            return
    [1, 2, 3, 2, 3]	    [4, 3, 1, 1, 0]
    1을 기준으로 배열 끝까지 1보다 작은수는 나오지 않는다. 즉 주식가격이 떨어지지 않은것으로
    2,3,2,3의 개수 총 4를 return배열에 입력

    2를 기준으로 배열 끝까지 2보다 작은수는 나오지 않는다. 즉 주식가격이 떨어지지 않은것으로
    3,2,3,의 개수 총 3을 return배열에 입력

    3을 기준으로 바로 다음에 3보다 작은수인 2가 나온다. 주식 가격이 떨어진 것으로
    1을 return배열에 입력

    2를 기준으로 배열 끝까지 2보다 작은수는 나오지 않는다. 즉 주식가격이 떨어지지 않은것으로
    총 1을 return배열에 입력

    마지막 숫자인 3은 비교할 수가 없으므로 무조건 마지막은 0을 입력한다.

    1. 이중 for문으로 기준값을 잡고, 그 다음부터 비교값을 비교해준다.
    2. 기준값이 비교값보다 클때까지 answer배열에 주식 가격이 얼마나 지속되는지 값을 대입하고 break로 탈출
    3. 비교값의 위치가 배열의 마지막일 경우에도 break로 탈출
    */
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] > prices[j] || j == prices.length - 1) {
                    answer[i] = j - i;
                    break;
                }
            }
        }
        answer[prices.length - 1] = 0;
        return answer;
    }
}
