package level2;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
public class Solution2_6Test {
    @Test
    public void 결과() {
        Solution2_6 solution = new Solution2_6();

        int[] prices= {1,2,3,2,3};
        int[] answer= {4,3,1,1,0};

        assertArrayEquals(answer, solution.solution(prices));

    }
}
