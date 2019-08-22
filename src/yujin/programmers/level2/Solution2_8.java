package yujin.programmers.level2;

import java.util.Arrays;

public class Solution2_8 {
/*
    <구명보트>
    무인도에 갇힌 사람들을 구명보트를 이용하여 구출하려고 합니다.
    구명보트는 작아서 한 번에 최대 **2명**씩 밖에 탈 수 없고, 무게 제한도 있습니다.

    예를 들어, 사람들의 몸무게가 [70kg, 50kg, 80kg, 50kg]이고 구명보트의 무게 제한이 100kg이라면
    2번째 사람과 4번째 사람은 같이 탈 수 있지만
    1번째 사람과 3번째 사람의 무게의 합은 150kg이므로
    구명보트의 무게 제한을 초과하여 같이 탈 수 없습니다.

    구명보트를 최대한 적게 사용하여 모든 사람을 구출하려고 합니다.

    사람들의 몸무게를 담은 배열 people과 구명보트의 무게 제한 limit가 매개변수로 주어질 때,
    모든 사람을 구출하기 위해 필요한 구명보트 개수의 최솟값을 return 하도록
    solution 함수를 작성해주세요.

    people	                  limit	      return
    [70, 50, 80, 50]	        100	        3
    [70, 80, 50]	            100	        3
    1. 최대 두명까지밖에 못 태우므로, 가장 몸무게가 적은 사람과 가장 몸무게가 많이 나가는 사람을 더해서 제한값과 비교해준다.
    → 배열 정렬하기.
    2. for문을 가장 몸무게가 많이 나갈때로 잡고 if문으로 가장 적은 몸무게랑 합산 후 비교해서
    limit보다 값이 작으면 둘이 태우고 구명보트 수 증가시키기
    3. 가장 적은 몸무게도 사용했으므로, 값 증가시키기
    4. else문에서 limit보다 값이 크면 구명보트에 몸무게가 가장 많이 나가는 사람만 태우므로 가장 적은 몸무게의 index는 변화 x
    5. i와 j가 같을 경우는 한명만 남는다는 뜻으로 한명태운다는 뜻으로 구명 보트 수 증가
    */

    public int solution(int[] people, int limit) {
        int answer = 0;
        int len = people.length;
        int j = 0;
        int i = 0;

        Arrays.sort(people);

        for (i = len - 1; i > j; i--) {
            if (people[j] + people[i] <= limit) {
                j++;
                answer++;
            } else {
                answer++;
            }
        }
        if(i==j) {
            answer++;
        }
        return answer;
    }
}
