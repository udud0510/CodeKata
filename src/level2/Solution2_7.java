package level2;

import java.util.ArrayList;
import java.util.List;

public class Solution2_7 {
    /*
    <기능개발>
    각 기능은 진도가 100%일 때 서비스에 반영할 수 있습니다.

    또각 기능의 개발속도는 모두 다르기 때문에 뒤에 있는 기능이 앞에 있는 기능보다
    먼저 개발될 수 있고, 이때 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포됩니다.

    먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수 배열 progresses와
    각 작업의 개발 속도가 적힌 정수 배열 speeds가 주어질 때
    각 배포마다 몇 개의 기능이 배포되는지를 return 하도록 solution 함수를 완성하세요.

    progresses	speeds	  return
    [93,30,55]	[1,30,5]	[2,1]

    첫 번째 기능은 93% 완료되어 있고 하루에 1%씩 작업이 가능하므로 7일 후 배포가 가능합니다.
    두 번째 기능은 30%가 완료되어 있고 하루에 30%씩 작업이 가능하므로 3일 후 배포가 가능합니다.
    하지만 이전 첫 번째 기능이 아직 완성된 상태가 아니기 때문에
    첫 번째 기능이 배포되는 7일째 배포됩니다.
    세 번째 기능은 55%가 완료되어 있고 하루에 5%씩 작업이 가능하므로 9일 후 배포가 가능합니다.
    따라서 7일째에 2개의 기능, 9일째에 1개의 기능이 배포됩니다.
    */

    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> preanswer = new ArrayList<>();
        int[] date = new int[speeds.length];

        int cnt = 1;

        for (int i = 0; i < speeds.length; i++) {
            progresses[i] = 100 - progresses[i];
            date[i] = progresses[i] / speeds[i];
            if (progresses[i] % speeds[i] != 0) {
                date[i] += 1;
            }
        }

        for (int i = 0; i < date.length; i++) {
            for (int j = i + 1; j < date.length; j++) {
                if (date[i] < date[j]) {
                    break;
                }
                else{
                    cnt++;
                }
            }
            preanswer.add(cnt);

            i=cnt+i-1;
            cnt = 1;
        }
        int[] answer = new int[preanswer.size()];

        for (int i = 0; i < preanswer.size(); i++) {
            answer[i] = preanswer.get(i);
        }

        for (int k = 0; k < preanswer.size(); k++) {
            System.out.println(answer[k]);
        }
        return answer;
    }
}
